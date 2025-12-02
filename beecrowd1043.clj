(require '[clojure.string :as str])

(let [[a b c] (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))
      is-triangle? (and (< a (+ b c)) (< b (+ a c)) (< c (+ a b)))]
  (if is-triangle?
    (println (format "Perimetro = %.1f" (+ a b c)))
    (println (format "Area = %.1f" (/ (* (+ a b) c) 2)))))