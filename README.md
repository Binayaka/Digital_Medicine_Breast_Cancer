# Digital_Medicine_Breast_Cancer

        This is a project for our Open Elective course on Digital Medicine. 

## Dataset

        The dataset used is :
        [Wisconsin Breast Cancer Dataset](https://archive.ics.uci.edu/ml/machine-learning-databases/breast-cancer-wisconsin/)


## Attribute Information: (class attribute has been moved to last column)

    #  Attribute                     Domain
    -- -----------------------------------------
    1. Sample code number            id number
    2. Clump Thickness               1 - 10
    3. Uniformity of Cell Size       1 - 10
    4. Uniformity of Cell Shape      1 - 10
    5. Marginal Adhesion             1 - 10
    6. Single Epithelial Cell Size   1 - 10
    7. Bare Nuclei                   1 - 10
    8. Bland Chromatin               1 - 10
    9. Normal Nucleoli               1 - 10
    10. Mitoses                       1 - 10
    11. Class:                        (2 for benign, 4 for malignant)

## Issues
    Missing attribute values: 16
        There are 16 instances that contain a single missing attribute value, denoted by "?". These instances were not taken for consideration.

        After cleaning the dataset, the original file is divided into training set and test set, 
        by taking 105 instances of the original file. These instances are removed from the training set, 
        so that our model's accuracy can be judged.

    ## Pre-processing
        Converted the data into a json format, with two key-value pairs (benign and malignant)

    ## Machine Learning Set up
        Setup a tensorflow training net with 2 hidden layers. 
