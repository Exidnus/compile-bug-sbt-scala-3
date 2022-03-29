import cats.Show

final case class Resource[R: Show](
  a: String,
  r: R
)