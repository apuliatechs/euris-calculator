/*
 * Copyright (C) 2021, Apuliatechs. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are not permitted without explicit signed consent.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package it.apuliatechs.euris.service.calculator.test.unit;

import it.apuliatechs.euris.service.calculator.engine.SimpleCalculatorEngine;
import it.apuliatechs.euris.service.calculator.exception.CalculationException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The SimpleCalculatorTest class.
 *
 * @author Apuliatechs
 * @version 1.0.0
 * @since 1.0.0
 */
public class SimpleCalculatorEngineTest {

    private static SimpleCalculatorEngine engine;

    @BeforeAll
    public static void setUp() {
        engine = new SimpleCalculatorEngine();
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "10,20,30",
            "27,44,71",
            "55,0,55"
    })
    void engine_whenValuesAreValid_ThenDoCalculation(Long first, Long second, Long expectedResult) {
        Long result = 0L;
        try {
            result = engine.sum(first, second);
        } catch (CalculationException e) {
            fail("Sum execution failed", e);
        }
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "9223372036854775807,1,Overflow",
            ",20,Null value",
            "20,,Null value",
    })
    void engine_whenValuesAreNotValid_ThenDoThrowException(Long first, Long second, String message) {
        CalculationException exception = assertThrows(
                CalculationException.class,
                () -> engine.sum(first, second),
                "Exception expected for " + message
        );
    }

}
