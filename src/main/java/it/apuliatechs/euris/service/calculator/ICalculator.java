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

import it.apuliatechs.euris.service.calculator.exception.CalculationException;

/**
 * The ICalculator interface.
 * Basic interface to represent a calculator with the four basic operations:
 * sum, subtract, divide and multiply.
 *
 * @author Apuliatechs
 * @version 1.0.0
 * @param <T> the type managed by the calculator
 * @param <S> the type allowed for division and multiplication
 * @since 1.0.0
 */
public interface ICalculator<T, S> {

    /**
     * This method returns the value of the sum between the first and the second element.
     * first + second = result
     *
     * @param first first sum value
     * @param second second sum value
     * @return the value of the sum between the first and the second element
     * @throws CalculationException if an exception occurred
     */
    T sum(T first, T second) throws CalculationException;

    /**
     * This method returns the value of the subtraction between the first and the second element.
     * first - second = result
     * If the operation is not possible a {@link CalculationException} will be thrown.
     *
     * @param first value to subtract from
     * @param second value to be subtracted
     * @return the value of the subtraction between the first and the second element
     * @throws CalculationException if an exception occurred
     */
    T subtract(T first, T second) throws CalculationException;

    /**
     * This method returns the value of the division between the first and the second element.
     * first / second = result
     * If the operation is not possible a {@link CalculationException} will be thrown.
     *
     * @param first value to divide
     * @param second value to divide by
     * @return the value of the division between the first and the second element
     * @throws CalculationException if an exception occurred
     */
    T divide(T first, S second) throws CalculationException;

    /**
     * This method returns the value of the multiplication between the first and the second element.
     * first * second = result
     *
     * @param first first multiplication value
     * @param second second multiplication value
     * @return the value of the multiplication between the first and the second element
     * @throws CalculationException if an exception occurred
     */
    T multiply(T first, S second) throws CalculationException;

}
