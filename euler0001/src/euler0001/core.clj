(ns euler0001.core)

(defn is-divisible-by-3-or-5? [number]
    "Determines whether the given number is divisible by 3 or 5."

    (or (zero? (mod number 3))
        (zero? (mod number 5)))
)

(defn -main [& [args]]
    (reduce + (filter is-divisible-by-3-or-5? (range 1000)))
)
