package com.craik.stock.ipo.controller;

import com.craik.stock.entity.IpoEntity;
import com.craik.stock.ipo.service.IpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ipo")
//@CrossOrigin(origins="http://localhost:4200")
public class IpoController {
    @Autowired
    private IpoService ipoService;

    /**
     *
     * @return
     */
    @GetMapping
    public List<IpoEntity> findAllIpos(){
        return ipoService.findAllIpos();
    }

    @PostMapping
    public ResponseEntity<IpoEntity> add(IpoEntity ipo){
        IpoEntity ipoEntity = ipoService.addIpo(ipo);
        return ResponseEntity.status(HttpStatus.CREATED).body(ipoEntity);
    }

    @PutMapping
    public ResponseEntity<IpoEntity> update(IpoEntity ipo){
        IpoEntity ipoEntity = ipoService.updateIpo(ipo);
        return ResponseEntity.ok(ipoEntity);
    }

    @GetMapping("/active/{id}")
    public ResponseEntity<IpoEntity> active(@PathVariable Integer id){
        IpoEntity ipo = ipoService.activeIpo(id);
        return ResponseEntity.ok(ipo);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        ipoService.delete(id);
        return ResponseEntity.ok("Delete ipo successfully.");
    }
}
