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
package it.apuliatechs.euris.service.calculator.engine;

import it.apuliatechs.euris.service.calculator.exception.CalculationException;

import java.util.function.BiFunction;

import static it.apuliatechs.euris.service.calculator.util.CalculatorUtil.valuesCheck;

/**
 * The SimpleCalculatorEngine class.
 *
 * @author Apuliatechs
 * @version 1.0.0
 * @since 1.0.0
 */
public class SimpleCalculatorEngine extends AbstractCalculatorEngine<Long, Long> {

    @Override
    public Long sum(Long first, Long second) throws CalculationException {
        return secureCall(first, second, "sum", Math::addExact);
    }

    @Override
    public Long subtract(Long first, Long second) throws CalculationException {
        return secureCall(first, second, "subtract", Math::subtractExact);
    }

    @Override
    public Long divide(Long first, Long second) throws CalculationException {
        return secureCall(first, second, "divide", Math::floorMod);
    }

    @Override
    public Long multiply(Long first, Long second) throws CalculationException {
        return secureCall(first, second, "multiply", Math::multiplyExact);
    }

    public Long secureCall(Long first, Long second, String functionName, BiFunction<Long, Long, Long> function) throws CalculationException {
        valuesCheck(first, second);
        long result;
        try {
            result = function.apply(first, second);
        } catch (ArithmeticException e) {
            throw new CalculationException("Error during " + functionName + " call", e);
        }
        return result;
    }

}
