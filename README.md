# Digital_Medicine_Breast_Cancer

        This is a project for our Open Elective course on Digital Medicine. 

## Dataset

        The dataset used is :
        [Wisconsin Breast Cancer Dataset]
        
        (https://archive.ics.uci.edu/ml/machine-learning-databases/breast-cancer-wisconsin/)


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
    10. Mitoses                      1 - 10
    11. Class:                       (2 for benign, 4 for malignant)


## Issues
    Missing attribute values: 16
        There are 16 instances that contain a single missing attribute value, denoted by "?". 
        These instances were not taken for consideration.

        After cleaning the dataset, the original file is divided into training set and test set, 
        by taking 15% instances of the original file. These instances are removed from the training set, 
        so that our model's accuracy can be judged.

## Pre-processing
        The DigitalMedicinePreprocessing is an eclipse Maven project, which was used to clean the data
        and separate into the training and testing data sets. The original data paths are hardcoded for now.

## Machine Learning Set up
        Setup a tensorflow training net with 10 hidden layers.


# Results
        Loss at step 0: 1.905704
        Training accuracy: 30.3%
        Validation accuracy: 31.2%
        Loss at step 2000: 0.154820
        Training accuracy: 95.8%
        Validation accuracy: 96.1%
        Loss at step 4000: 0.100707
        Training accuracy: 96.2%
        Validation accuracy: 97.1%
        Loss at step 6000: 0.077260
        Training accuracy: 96.9%
        Validation accuracy: 96.6%
        Loss at step 8000: 0.067202
        Training accuracy: 97.1%
        Validation accuracy: 97.1%