(require '[clojure.string :as str])

(let [[a b] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
  (if (or (= 0 (mod a b)) (= 0 (mod b a)))
    (println "Sao Multiplos")
    (println "Nao sao Multiplos")))