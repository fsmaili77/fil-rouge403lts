package com.gestionnaire.notes.controler;

import com.gestionnaire.notes.dao.EtudiantDao;
import com.gestionnaire.notes.entities.Etudiant;
import com.gestionnaire.notes.service.EtudiantService;
import com.gestionnaire.notes.service.NoteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(EtudiantControler.class)
class EtudiantControlerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    EtudiantService etudiantService;
    @MockBean
    NoteService noteService;


    @MockBean
    EtudiantDao etudiantDao;

    @Test
    void getMoyForEtudiant() throws Exception {
        /*Etudiant etudiantValue = new Etudiant();
        etudiantValue.setId(2);
        etudiantValue.setPrenom("Kylian");
        *//*when(etudiantDao.findEtudiantById(1))
            .thenReturn()*//*
        when(etudiantService.getMoyForEtudiant(2))
            .thenReturn(13.33);

        mockMvc.perform(get("/Etudiants/{id}/moy"))
            .andDo(print())
            .andExpect(status().isOk())
            *//*.andExpect(content().contentType(equalTo(1)))*//*;
        verify(etudiantService).getMoyForEtudiant(1);*/

    }

    @Test
    void getMoyGenerale() {
    }

    @Test
    void getMoyenneGeneraleClasse() {
    }

    @Test
    void getAllMoyenneForEtudiant() {
    }

    @Test
    void getMoyenneOfClasseForMatiere() {
    }
}