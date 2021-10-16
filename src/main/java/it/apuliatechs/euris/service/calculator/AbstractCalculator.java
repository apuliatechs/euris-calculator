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
package it.apuliatechs.euris.service.calculator;

import it.apuliatechs.euris.service.calculator.engine.AbstractCalculatorEngine;
import it.apuliatechs.euris.service.calculator.exception.CalculationException;

/**
 * The AbstractCalculator class.
 * Abstract facade to represent a calculator with the four basic operations:
 * sum, subtract, divide and multiply.
 * It needs an engine to be instantiated.
 *
 * @author Apuliatechs
 * @version 1.0.0
 * @param <T> the type managed by the calculator engine
 * @param <S> the type allowed for division and multiplication by the calculator engine
 * @see AbstractCalculatorEngine
 * @since 1.0.0
 */
public class AbstractCalculator<T, S> implements ICalculator<T, S> {

    AbstractCalculatorEngine<T, S> engine;

    public AbstractCalculator(AbstractCalculatorEngine<T, S> engine) {
        this.engine = engine;
    }

    @Override
    public T sum(T first, T second) throws CalculationException {
        return engine.sum(first, second);
    }

    @Override
    public T subtract(T first, T second) throws CalculationException {
        return engine.subtract(first, second);
    }

    @Override
    public T divide(T first, S second) throws CalculationException {
        return engine.divide(first, second);
    }

    @Override
    public T multiply(T first, S second) throws CalculationException {
        return engine.multiply(first, second);
    }

}
