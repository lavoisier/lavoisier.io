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

package io.lavoisier.model.action;

import io.lavoisier.model.action.pk.ActionPk;
import io.lavoisier.model.channel.Channel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lav_action")
@Data
public class Action {
    @EmbeddedId
    private ActionPk id;

    @ManyToOne(optional = false)
    @MapsId("channelId")
    private Channel channel;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns({
        @JoinColumn(name = "channel_id"),
        @JoinColumn(name = "action_id")
    })
    private List<ActionInput> inputs;
}
