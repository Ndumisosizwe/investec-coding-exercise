# Investec-Coding-Exercise

# The run (Main) class :
To run solution samples, please find the class
```
com.investec.assessment.AssessmentApp
```

# Switching json files (where to change file path/names)
Please find my utility class :
```
com.investec.assessment.util.AddressUtil
```
where you can make the change inorder to attach a different file for example.


### JSON file location
You can put the files in :
```
/resources
```

can be anywhere in the classpath.

### Building the App
Use maven to build and get dependencies, on your terminal : 

```
mvn install
```
### Java version
```
JDK 1.8
```



# Problem Instructions
Problems to solve using language of choice.

Write any utility functions you feel necessary.

 ### 1.

Find the highest common factor (https://en.wikipedia.org/wiki/Greatest_common_divisor) for a given array of integers
```
// example Java function definition
```
```
public int highestCommonFactor(int[] numbers) {

    // your code here

}
```

### 2.
Given the attached addresses.json file which contains an array of address, do the following:
### a
Write a function to return a pretty print version of an address in the format: ``` Type: Line details - city - province/state - postal code – country ```
```
// example Java function definition
```
```
  public String prettyPrintAddress(Address address) {

    // your code here

  }
```
### b
Write a function to pretty print all the addresses in the attached file
### c
Write a function to print an address of a certain type (postal, physical, business)

### d
Write a function to validate an address
 i.    A valid address must consist of a numeric postal code, a country, and at least one address line that is not blank or null. If the country is ZA, then a province is required as well.

For each address in the attached file, determine if it is valid or not, and if not give an indication of what is invalid in a message format of your choice.
