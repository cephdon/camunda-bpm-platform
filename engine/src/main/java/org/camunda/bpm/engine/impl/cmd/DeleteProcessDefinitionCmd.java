/*
 * Copyright 2016 camunda services GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.impl.cmd;

import org.camunda.bpm.engine.impl.interceptor.CommandContext;

/**
 * Command to delete a process definition from a deployment.
 *
 * @author Christopher Zell <christopher.zell@camunda.com>
 */
public class DeleteProcessDefinitionCmd extends AbstractDeleteProcessDefinitionCmd {

  public DeleteProcessDefinitionCmd(String processDefinitionId, Boolean cascade, Boolean skipCustomListeners) {
    this.processDefinitionId = processDefinitionId;
    this.cascade = cascade;
    this.skipCustomListeners = skipCustomListeners;
  }

  @Override
  public Void execute(CommandContext commandContext) {
    deleteProcessDefinitionCmd(commandContext, processDefinitionId, cascade, skipCustomListeners);

    return null;
  }
}
