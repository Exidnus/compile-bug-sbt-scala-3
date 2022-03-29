import cats.effect.Async

trait Cache[F[_], S[_, _], K, V] {
  def put(k: K, v: V)(implicit M: Async[F]): F[S[K, V]]
}