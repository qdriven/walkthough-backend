package io.qkits.corejava.corejava.thread;
/*
 * Copyright [2015] [Jeff Lee]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Jeff Lee
 * @since 2015-7-4 16:14:47
 * 	Runnable接口的简单使用
 * 	测试 --> {@link MyRunnableTest}
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunnable --> run()");
	}

}
