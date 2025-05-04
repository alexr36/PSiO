# Lab 11 - Try-catch vs Throws comparison

## Description
An experiment was conducted to measure and compare the execution time of exception handling using ```try-catch``` blocks versus the ```throws``` declaration. The study focused on two types of exceptions: ```ArrayIndexOutOfBoundsException``` and ```ArithmeticException```. The tests were performed with varying numbers of repetitions — 100, 1,000, and 10,000 — in order to evaluate the scalability and performance impact of each exception handling method. The results provided insight into how different handling strategies affect runtime efficiency depending on the exception type and frequency of occurrence.

## Results
Tables contain execution time in nanoseconds.

#### ```ArrayIndexOutOfBoundsException```
| Repeats | Try-catch  | Throws     |
|:--------|-----------:|-----------:|
| 100     | 7,270,708  | 5,206,792  |
| 1,000   | 26,087,917 | 6,515,791  |
| 10,000  | 50,610,542 | 26,294,834 |


#### ```ArithmeticException```
| Repeats | Try-catch  | Throws     |
|:--------|-----------:|-----------:|
| 100     | 5,936,459  | 4,172,791  |
| 1,000   | 20,760,208 | 12,799,667 |
| 10,000  | 48,736,125 | 27,481,709 |

### Plots
1. Try-catch
   ![Try-catch execution time bar diagram](https://github.com/alexr36/PSiO/blob/main/Laboratoria/List11/Zad2/plots/try_catch_bar.png)

2. Throws
   ![Throws execution time bar diagram](https://github.com/alexr36/PSiO/blob/main/Laboratoria/List11/Zad2/plots/throws_bar.png)


## Conclusions
Based on the conducted experiment, we conclude that in most cases, using ```try-catch``` for exception handling may be inefficient. The difference in exception handling times is significant enough that declaring exceptions with ```throws``` is generally a more favorable option. The ```try-catch``` block is recommended only in situations where specific actions are required in response to certain exceptions. In such cases, it allows for customized error handling tailored to individual needs, making ```try-catch``` a more reasonable solution.
