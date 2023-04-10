package ehsun7b.coolio.codec

import ehsun7b.coolio.Result
import ehsun7b.coolio.entity.Entry

trait Encoder {

  def encode(entry: Entry): Result[String]
}
