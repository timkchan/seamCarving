# Seam Carving
![](demo.gif?raw=true)

### 1. Overview of Seam Carving

Suppose you have an image and want rescale it in a way that doesn't preserve the aspect ratio, e.g. you have a widescreen movie that you'd like to view on a square screen. Two obvious choices are rescaling and cropping. However, rescaling makes everything look weird, and cropping means you lose the edge of the image.

There is an image resizing technique known as [seam carving] that avoids these problems.

### 2. Files

Files in this project (not all are shown):

* `README.md`:              This file
* `Makefile`:               A makefile that will compile your files and run tests.
* `ImageRescaler.java`:     Main function.
* `MatrixUtils.java`:       Seam Carving algorithm.
* `MatrixUtilsTest.java`:   Unit tests.
* `*.java`:                 Helper classes.
* `*.jpg`:                  Images for demo.

### 3. Running the Image Rescaler
Go into project root directory (where you will see files `ImageRescaler.java`, `MatrixUtils.java`), remove all old classes:
```sh
$ make clean
```

Compile all java files (A `make` file has been made to achieve this, go inside `make` to see more options):
```sh
$ make
```

Test Image Rescaler source integrity (Not exhaustive) (Optional) (Certain key functions that used by the ImageRescaler will be run and the output will be compared against expected output):
```sh
$ make check
```

Now the rescaler is ready to run:

```sh
$ java ImageRescaler face.jpg 200 100
```
\* First number `200` is how many columns to reduced by and the second number `100` is how many rows to reduced by. Feel free to experiment with different numbers.

### 4. Class Project Site
[here]

[seam carving]:  <https://en.wikipedia.org/wiki/Seam_carving>
[here]: <https://inst.eecs.berkeley.edu/~cs61b/fa15/hw/hw2/>