package com.gestionnaire.notes.controler;

import com.gestionnaire.notes.entities.Etudiant;
import com.gestionnaire.notes.service.EtudiantService;
import com.gestionnaire.notes.service.NoteService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class EtudiantControlerUnitTest {

//    @Test
//    void shouldGetEtudiantById() {
//        EtudiantService etudiantService = Mockito.mock(EtudiantService.class);
//        NoteService noteService = Mockito.mock(NoteService.class);
//
//        Etudiant expected = new Etudiant();
//        expected.setPrenom("Antoine");
//        expected.setId(1);
//        when(etudiantService.findEtudiantById(1)).thenReturn(expected);
//        EtudiantControler etudiantControler = new EtudiantControler(etudiantService, noteService);
//        ResponseEntity<Etudiant> expectedResponse = ResponseEntity.ok(expected);
//
//
//        assertEquals(expectedResponse, etudiantControler.getEtudiantById(1));
//
//        verify(etudiantService).findEtudiantById(1);
//
//    }
}