(ns clojure-ttt.start
  (require [clojure-ttt.board :refer :all])
  (require [clojure-ttt.game :refer :all]))

(defn -main []
(def board ["-" "-" "-" "-" "-" "-" "-" "-" "-"])
  (display board 3)
  (start-game board 3))

