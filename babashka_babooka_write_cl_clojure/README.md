# Babashka Babooka: Write Command-Line Clojure

# Table of Contents
- [Babashka Babooka: Write Command-Line Clojure](#babashka-babooka-write-command-line-clojure)
- [Table of Contents](#table-of-contents)
  - [Chapter 1: Getting Started](#chapter-1-getting-started)
  - [Chapter 2: Working with Files](#chapter-2-working-with-files)
  - [Chapter 3: Organising Your Project](#chapter-3-organising-your-project)

## Chapter 1: Getting Started
In this chapter, the author introduces Babashka and its benefits for writing command-line applications in Clojure. The chapter covers the installation process and guides the reader through their first script using Babashka.

```bash
./my-script build
./my-script deploy
```

```clojure
#!/usr/bin/env bb

(println "Hello, world!")
```

## Chapter 2: Working with Files
The second chapter dives into working with files in Babashka. It explains how to read and write files, manipulate file paths, and handle file-related operations. The author provides practical examples and code snippets to illustrate the concepts.

```clojure
#!/usr/bin/env bb

(require '[clojure.java.io :as io])

(defn read-file
  "Reads a file and returns its contents as a string."
  [file]
  (slurp file))

(defn write-file
  "Writes a string to a file."
  [file content]
  (spit file content))

(defn append-file
  "Appends a string to a file."
  [file content]
  (spit file content :append true))

(defn delete-file
  "Deletes a file."
  [file]
  (io/delete-file file))
```

## Chapter 3: Organising Your Project
In Chapter 3, the focus is on organizing a Babashka project effectively. The chapter explores strategies for structuring code, managing dependencies, and creating reusable components. The author shares best practices for maintaining a clean and maintainable codebase.

```clojure
#!/usr/bin/env bb

(require '[babashka.deps :as deps])

(deps/add-deps '{:deps {clj-http {:mvn/version "3.12.0"}}})

(require '[clj-http.client :as http])

(defn get
  "Returns the response body of a GET request."
  [url]
  (http/get url {:as :string}))
```
