(require '[clojure.string :as str])

(let [[a b c d] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
  (if (and (> b c) (> d a) (> (+ c d) (+ a b)) (pos? c) (pos? d) (even? a))
    (println "Valores aceitos")
    (println "Valores nao aceitos")))