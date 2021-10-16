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

import it.apuliatechs.euris.service.calculator.ICalculator;

/**
 * The AbstractCalculatorEngine class.
 * Abstract class to extend in order to provide an engine implementation for an {@link it.apuliatechs.euris.service.calculator.AbstractCalculator}.
 *
 * @author Apuliatechs
 * @version 1.0.0
 * @param <T> the type managed by the calculator engine
 * @param <S> the type allowed for division and multiplication by the calculator engine
 * @see it.apuliatechs.euris.service.calculator.AbstractCalculator
 * @since 1.0.0
 */
public abstract class AbstractCalculatorEngine<T, S> implements ICalculator<T, S> {
}