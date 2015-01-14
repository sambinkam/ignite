/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.fs;

import org.jetbrains.annotations.*;

/**
 * {@code GGFS} exception indicating that operation target is invalid
 * (e.g. not a file while expecting to be a file).
 */
public class IgniteFsInvalidPathException extends IgniteFsException {
    /** */
    private static final long serialVersionUID = 0L;

    /**
     * Creates exception with given error message.
     *
     * @param msg Error message.
     */
    public IgniteFsInvalidPathException(String msg) {
        super(msg);
    }

    /**
     * Creates exception with given exception cause.
     *
     * @param cause Exception cause.
     */
    public IgniteFsInvalidPathException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates exception with given error message and exception cause.
     *
     * @param msg Error message.
     * @param cause Error cause.
     */
    public IgniteFsInvalidPathException(String msg, @Nullable Throwable cause) {
        super(msg, cause);
    }
}
