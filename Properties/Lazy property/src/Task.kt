class LazyProperty(val initializer: () -> Int) {
    private var cached: Int? = null

    val lazy: Int
        get() {
            if (cached == null) {
                cached = initializer()
            }
            return cached!!
        }
}
