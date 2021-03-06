/* ###
 * IP: GHIDRA
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
package agent.dbgeng.manager.evt;

import agent.dbgeng.manager.breakpoint.DbgBreakpointInfo;

/**
 * The event corresponding with "{@code =breakpoint-created}"
 */
public class DbgBreakpointCreatedEvent extends AbstractDbgEvent<DbgBreakpointInfo> {
	private final DbgBreakpointInfo bkptInfo;

	/**
	 * Construct a new event by parsing the tail for information
	 * 
	 * The breakpoint information must be specified by GDB.
	 * 
	 * @param info breakpoint info
	 * 
	 */
	public DbgBreakpointCreatedEvent(DbgBreakpointInfo info) {
		super(info);
		this.bkptInfo = info;
	}

	/**
	 * Get the breakpoint information
	 * 
	 * @return the parsed, but not processed, breakpoint information
	 */
	public DbgBreakpointInfo getBreakpointInfo() {
		return bkptInfo;
	}
}
