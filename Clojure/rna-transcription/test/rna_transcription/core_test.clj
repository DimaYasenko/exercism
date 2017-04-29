(ns rna-transcription.core-test
  (:require [clojure.test :refer :all]
            [rna-transcription.core :refer :all]))

(deftest transcribes-cytosine-to-guanine
  (is (= "G" (rna-transcription.core/to-rna "C"))))

(deftest transcribes-guanine-to-cytosine
  (is (= "C" (rna-transcription.core/to-rna "G"))))

(deftest transcribes-adenine-to-uracil
  (is (= "U" (rna-transcription.core/to-rna "A"))))

(deftest it-transcribes-thymine-to-adenine
  (is (= "A" (rna-transcription.core/to-rna "T"))))

(deftest it-transcribes-all-nucleotides
  (is (= "UGCACCAGAAUU" (rna-transcription.core/to-rna "ACGTGGTCTTAA"))))

(deftest it-validates-dna-strands
  (is (thrown? AssertionError (rna-transcription.core/to-rna "XCGFGGTDTTAA"))))

