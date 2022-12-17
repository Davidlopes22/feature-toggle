package com.mentoria.featuretoggle.application.controller;

import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityPatchDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityResponseDTO;
import com.mentoria.featuretoggle.domain.service.FunctionalityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/functionality")
public class FunctionalityController {

    private final FunctionalityService functionalityService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createFunctionality(@RequestBody @Valid FunctionalityCreationDTO functionalityCreationDTO) {
        functionalityService.save(functionalityCreationDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FunctionalityResponseDTO getFunctionality(@PathVariable("id") Long id) {
        return functionalityService.findById(id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void patchFuncionality(@PathVariable("id") Long id, @RequestBody @Valid FunctionalityPatchDTO functionalityPatchDTO){
        functionalityService.patch(id, functionalityPatchDTO);
    }

}
