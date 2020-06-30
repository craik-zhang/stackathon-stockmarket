package com.craik.stock.ipo.service;

import com.craik.stock.entity.IpoEntity;
import com.craik.stock.ipo.repository.IpoRepository;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IpoBusiness implements IpoService{
    @Autowired
    private IpoRepository repository;
    @Override
    public Map<String,Object> fileUpload(MultipartFile file) {
        Map<String,Object> result = new HashMap<>();
        try {
            String fileName = file.getOriginalFilename();
            Workbook workbook;
            if(fileName.endsWith("xls")){
                workbook = new HSSFWorkbook(file.getInputStream());
            }else if(fileName.endsWith("xlsx")){
                workbook = new XSSFWorkbook(file.getInputStream());
            } else {
                result.put("code","1");
                result.put("message","wrong format");
                return result;
            }
            //sheet one not null
            if(null != workbook.getSheetAt(0)){
                //read from second line from 1
                for(int rowNumofSheet = 1; rowNumofSheet <= workbook.getSheetAt(0).getLastRowNum(); rowNumofSheet++){
                    if (null != workbook.getSheetAt(0).getRow(rowNumofSheet)) {
                        //define row
                        Row aRow = workbook.getSheetAt(0).getRow(rowNumofSheet);
                        IpoEntity ipo = new IpoEntity();
                        System.out.println(aRow.getLastCellNum());
                        for(int cellNumofRow=0;cellNumofRow<aRow.getLastCellNum();cellNumofRow++){
                            Cell xCell = aRow.getCell(cellNumofRow);
                            Object cell_val;
                            if(cellNumofRow == 0){
                                if(xCell != null && !xCell.toString().trim().isEmpty()){
                                    cell_val = xCell.getStringCellValue();
                                    if(cell_val != null){
                                        String temp = (String)cell_val;
                                        ipo.setId(Integer.valueOf(temp));
                                    }
                                }
                            }
                            if(cellNumofRow == 1){
                                if(xCell != null && !xCell.toString().trim().isEmpty()){
                                    cell_val = xCell.getStringCellValue();
                                    if(cell_val != null){
                                        String temp = (String)cell_val;
                                        if("companyName".equals(temp)){
                                            ipo.setCompanyName(temp);
                                        }
                                        if("stockExchange".equals(temp)){
                                            ipo.setStockExchange(temp);
                                        }
                                        ipo.setOpenDateTime(new Date());
                                        repository.uploadFile(ipo.getCompanyName(), ipo.getStockExchange(), ipo.getPricePerShare(),
                                                ipo.getNumOfShares(), ipo.getOpenDateTime(), ipo.getRemarks());
                                    }
                                }
                            }
                        }

                    }
                }
                result.put("code","0");
                result.put("message","upload successfully！");
            }else {
                result.put("code","1");
                result.put("message","first sheet of EXCL with No data！");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.put("code","1");
            result.put("message",e.getMessage());
        }
        return result;
    }

    @Override
    public Page<IpoEntity> findAll(int page, int pageSize) {
        return null;
    }

    @Override
    public List<IpoEntity> findAllIpos() {
        return null;
    }

    @Override
    public IpoEntity findIpoById(Integer id) {
        return null;
    }

    @Override
    public IpoEntity addIpo(IpoEntity ipo) {
        return null;
    }

    @Override
    public IpoEntity updateIpo(IpoEntity ipo) {
        return null;
    }

    @Override
    public IpoEntity activeIpo(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
