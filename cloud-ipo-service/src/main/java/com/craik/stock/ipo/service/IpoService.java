package com.craik.stock.ipo.service;

import com.craik.stock.entity.IpoEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IpoService {

    /**
     * ��ҳ��ѯ�û��б�
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<IpoEntity> findAll(int page, int pageSize);

    /**
     * ��ѯ�����û��б�
     *
     * @return
     */
    public List<IpoEntity> findAllIpos();

    /**
     * ����ID��ѯһ���û�
     *
     * @param
     * @return
     */
    public IpoEntity findIpoById(Integer id);

    /**
     * ע��һ���û�
     *
     * @param ipo
     * @return
     */
    public IpoEntity addIpo(IpoEntity ipo);

    /**
     * �����û���Ϣ
     *
     * @param ipo
     * @return
     */
    public IpoEntity updateIpo(IpoEntity ipo);

    /**
     * �����û�
     *
     * @param id
     * @return
     */
    public IpoEntity activeIpo(Integer id);

    /**
     * ɾ��һ���û�
     *
     * @param id
     */
    public void delete(Integer id);
}
