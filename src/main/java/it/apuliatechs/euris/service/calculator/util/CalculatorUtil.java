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
package it.apuliatechs.euris.service.calculator.util;

import it.apuliatechs.euris.service.calculator.exception.CalculationException;

import static java.util.Objects.isNull;

/**
 * The CalculatorUtil class.
 *
 * @author Apuliatechs
 * @version 1.0.0
 * @since 1.0.0
 */
public class CalculatorUtil {

    public static void valuesCheck(Object... values) throws CalculationException {
        for (int i = 0; i < values.length; i++) {
            valueCheck(values[i], "Value [" + (i+1) + "] is null");
        }
    }

    public static void valuesCheck(Object first, Object second) throws CalculationException {
        valueCheck(first, "The first value is null");
        valueCheck(second, "The second value is null");
    }

    public static void valueCheck(Object value, String message) throws CalculationException {
        if (isNull(value)) throw new CalculationException(message);
    }

}
