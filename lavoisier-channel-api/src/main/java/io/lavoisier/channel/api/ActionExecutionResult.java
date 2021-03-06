/*
 * Copyright (C) 2016 Lavoisier.io
 *
 * This file is part of the Lavoisier.io project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.lavoisier.channel.api;

/**
 * The result of an {@link Action}'s execution.
 *
 * Contains:
 * <ul>
 * <li>a boolean indicating whether or not it succeeded</li>
 * <li>a message in case of failure</li>
 * </ul>
 */
public final class ActionExecutionResult {

    private boolean success;

    private String errorMessage;

    private ActionExecutionResult(boolean success, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public static ActionExecutionResult success() {
        return new ActionExecutionResult(true, null);
    }

    public static ActionExecutionResult failure(String message) {
        return new ActionExecutionResult(false, message);
    }
}
