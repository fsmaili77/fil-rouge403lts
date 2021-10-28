package com.gestionnaire.notes.service;

import com.gestionnaire.notes.dao.EtudiantDao;
import com.gestionnaire.notes.entities.Etudiant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EtudiantServiceTest {
    @Mock
    private EtudiantDao etudiantDao;
    private EtudiantService underTest;

    @BeforeEach
    void setUp() {
        underTest = new EtudiantService(etudiantDao);
    }

    @Test
    void canGetAllEtudiants() {
        // when
        underTest.findAllEtudiants();
        //then
        verify(etudiantDao).findAll();
    }

    @Test
    void canAddStudent(){
        //given
        Etudiant etudiant = new Etudiant(
            15,
            "Fehmir",
            "Smaili",
            "11.12.1999",
            "fehmir@gmail.com", new ArrayList<>());

        //when
        underTest.addEtudiant(etudiant);

        //then
        ArgumentCaptor<Etudiant> etudiantArgumentCaptor =
            ArgumentCaptor.forClass(Etudiant.class);
        verify(etudiantDao)
            .save(etudiantArgumentCaptor.capture());
        Etudiant capturedEtudiant = etudiantArgumentCaptor.getValue();
        assertThat(capturedEtudiant).isEqualTo(etudiant);
    }

    @Test
    @Disabled
    void CanfindEtudiantById() {
        //when
        underTest.findEtudiantById(15);
        Etudiant expected = new Etudiant(15,
            "Fehmir",
            "Smaili",
            "11.12.1999",
            "fehmir@gmail.com", new ArrayList<>());
        //underTest.findEtudiantById(15);
        //then
        when(underTest.findEtudiantById(15).getId());
        verify(etudiantDao).findEtudiantById(15);

    }

    @Test
    @Disabled
    void shouldGetMoyForEtudiant() {
        underTest.getMoyForEtudiant(1);
        verify(etudiantDao).findById(1);
    }

    @Test
    @Disabled
    void getMoyForEtudiantByNotes() {
    }

    @Test
    @Disabled
    void getMoyGenerale() {
    }
}