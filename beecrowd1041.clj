(require '[clojure.string :as str])

(let [[x y] (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))]
  (cond
    (and (= y 0.0) (= x 0.0)) (println "Origem")
    (= y 0.0) (println "Eixo X")
    (= x 0.0) (println "Eixo Y")
    (and (> x 0) (< y 0)) (println "Q4")
    (and (< x 0) (< y 0)) (println "Q3")
    (and (< x 0) (> y 0)) (println "Q2")
    (and (> x 0) (> y 0)) (println "Q1")))