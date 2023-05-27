package com.api.nyx.gastosrecife.controllers;

import com.api.nyx.gastosrecife.dtos.DespesasDto;
import com.api.nyx.gastosrecife.models.DespesasModel;
import com.api.nyx.gastosrecife.services.DespesasService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/despesas")
public class DespesasController {

    final DespesasService despesasService;

    public DespesasController(DespesasService despesasService) {
        this.despesasService = despesasService;
    }

    @PostMapping
    public ResponseEntity<Object> saveDespesa(@RequestBody @Valid DespesasDto despesasDto) {
        var despesaModel = new DespesasModel();
        BeanUtils.copyProperties(despesasDto, despesaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(despesasService.save(despesaModel));
    }

    @GetMapping("/{ano}/total")
    public ResponseEntity<Object> getTotalDespesasByAno(@PathVariable int ano) {

        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAno(ano));
    }

    @GetMapping("/{ano}/categoria")
    public ResponseEntity<Object> getTotalDespesasByAnoGroupByCategoriaEconomica(@PathVariable int ano) {
        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAnoGroupByCategoriaEconomica(ano));
    }

    @GetMapping("/{ano}/mes")
    public ResponseEntity<Object> getTotalDespesasByAnoGroupByMesMovimentacao(@PathVariable int ano) {
        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAnoGroupByMesMovimentacao(ano));
    }

    @GetMapping("/{ano}/fonte")
    public ResponseEntity<Object> getTotalDespesasByAnoGroupByFonteRecurso(@PathVariable int ano) {
        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAnoGroupByFonteRecurso(ano));
    }

}
