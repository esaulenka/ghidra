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
package agent.dbgmodel.impl.dbgmodel.debughost;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Variant.VARIANT;

import agent.dbgmodel.jna.dbgmodel.debughost.IDebugHostConstant;

import com.sun.jna.platform.win32.COM.COMUtils;

public class DebugHostConstantImpl extends DebugHostBaseClassImpl
		implements DebugHostConstantInternal {
	@SuppressWarnings("unused")
	private final IDebugHostConstant jnaData;

	public DebugHostConstantImpl(IDebugHostConstant jnaData) {
		super(jnaData);
		this.jnaData = jnaData;
	}

	@Override
	public Pointer getPointer() {
		return jnaData.getPointer();
	}

	@Override
	public VARIANT getValue() {
		VARIANT.ByReference pValue = new VARIANT.ByReference();
		COMUtils.checkRC(jnaData.GetValue(pValue));
		return (VARIANT) pValue.getValue();
	}

}
