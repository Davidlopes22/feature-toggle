package com.mentoria.featuretoggle.application.controller;

import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityPatchDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityResponseDTO;
import com.mentoria.featuretoggle.domain.service.FunctionalityService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @ResponseStatus(HttpStatus.CREATED)
    public void patchFunctionality(@PathVariable("id") Long id, @RequestBody @Valid FunctionalityPatchDTO functionalityPatchDTO) {
        functionalityService.patch(id, functionalityPatchDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteFunctionality(@PathVariable("id") Long id) {
        functionalityService.delete(id);
    }
}
