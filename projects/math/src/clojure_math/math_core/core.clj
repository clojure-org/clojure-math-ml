(ns clojure-math.math.math-core.core) ;; the very core of math core... heh :-)


;;; Number Sets (R (real), Q (rational), Z (integer), W (whole), N (natural), R-Q (irrational))
:number-sets/natural-number
:number-sets/natural-number-set
:number-sets/whole-number
:number-sets/whole-number-set
:number-sets/integer-number
:number-sets/integer-number-set
:number-sets/rational-number
:number-sets/rational-number-set
:number-sets/irrational-number
:number-sets/irrational-number-set
:number-sets/real-number
:number-sets/real-number-set

;;;; Meta-Definers


number-set-expanse []
  :number-sets/natural-number-set => :number-sets/whole-number-set =>
number-set-collapse []

set-expands-to [number-set]
set-collapses-to [number-set]


;;;; Definition-Instances
(defn natural-number-set
  "Generates as a lazy sequence, the set of natural-numbers {1,2,3,4,5,...}"
  []
  )

(defn whole-number-set
  "Generates as a lazy sequence, the set of whole-numbers {0, }"
  [])

(defn integer-number-set
  "Generates as a lazy sequence, the set of integer-numbers"
  [])

(defn rational-number-set
  "Generates as a lazy sequence, the set of rational-numbers"
  [])

(defn irrational-number-set
  "Generates as a lazy sequence, the set of irrational-numbers"
  [])

(defn real-number-set
  "Generates as a lazy sequence, the set of natural-numbers"
  [])

(defn numbers-number-set
  "Returns the number-set of a given number"
  [number]
  )

(defn is-natural-number [number])
(defn is-whole-number
is-integer-number
is-rational-number
is-irrational-number
is-real-number



;;; Identity Numbers

(defn identity-number [operator]
  (cond
    (= operator +) 0
    (= operator *) 1))


;; Opposites

(defn number-opposite
  "Returns the numeric opposite of a given number. I.e. 5 returns -5" 
  [number])
