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

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters needed for an action execution.
 *
 * It contains :
 *
 * - The action's channel global activation parameters
 * - The action's channel user activation parameters
 * - The action's input
 */
public final class ActionExecutionParameters {

    private Map<String, String> globalActivationParameters = new HashMap<>();

    private Map<String, String> userActivationParameters = new HashMap<>();

    private Map<String, String> input = new HashMap<>();

    public Map<String, String> getGlobalActivationParameters() {
        return globalActivationParameters;
    }

    public Map<String, String> getUserActivationParameters() {
        return userActivationParameters;
    }

    public Map<String, String> getInput() {
        return input;
    }
}