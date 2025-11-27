(require '[clojure.string :as str])

(let [[a b c] (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))
      delta (- (* b b) (* 4 a c))]
  (if (and (pos? delta) (pos? (* 2 a)))
    (do
      (let [x1 (/ (+ (- b) (Math/sqrt delta)) (* 2 a))
            x2 (/ (- (- b) (Math/sqrt delta)) (* 2 a))]
        (println (format "R1 = %.5f" x1))
        (println (format "R2 = %.5f" x2))))
    (println "Impossivel calcular")))