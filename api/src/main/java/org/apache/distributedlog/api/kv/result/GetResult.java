/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.distributedlog.api.kv.result;

import io.netty.buffer.ByteBuf;
import java.util.List;
import lombok.Data;
import org.apache.bookkeeper.common.kv.KV;

/**
 * Get result.
 */
@Data
public class GetResult {

  private final Header header;
  private final ByteBuf pKey;
  private final List<KV<ByteBuf, ByteBuf>> kvs;
  private final boolean more;
  private final long count;

}
