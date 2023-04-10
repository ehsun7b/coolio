package ehsun7b.coolio.codec

import ehsun7b.coolio.Result
import ehsun7b.coolio.entity.Entry

trait Decoder {

  def decode(str: String): Result[Entry]
}
