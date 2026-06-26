package com.jcking97.dinocardgamebackend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class TestDinoControllerGetRandomDinos {

    @Mock
    private DinoService dinoService;

    @InjectMocks
    private DinoController dinoController;

    @Test
    void getRandomDinos_callsServiceAndReturnsExpectedValue() {
        when(dinoService.getRandomDinos(eq(3))).thenReturn(List.of());

        var result = dinoController.getRandomDinos(3);

        assertThat(result).isNotNull();
        verify(dinoService).getRandomDinos(3);
    }
}
