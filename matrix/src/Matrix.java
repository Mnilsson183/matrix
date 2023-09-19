/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author morgan
 */
public class Matrix {
    
    float[][] matrix;
    int rowSize;
    int columnSize;
    public Matrix(int rowSize, int columnSize){
         this.matrix = new float[rowSize][columnSize];
         this.rowSize = rowSize;
         this.columnSize = columnSize;
         
     }
     
    private float[][] setValue(float value, int rowIndex, int columnIndex){
          this.matrix[rowIndex][columnIndex] = value;
          return this.matrix;
     }
     
     private float getValue(int rowIndex, int columnIndex){
         return this.matrix[rowIndex][columnIndex];
     }
     private void copy(Matrix source, Matrix destination) throws Exception{
         if (source.rowSize != destination.rowSize || source.columnSize != destination.columnSize){
             throw new Exception("The Matrices are not of equal size");
         }
         for (int row = 0; row < rowSize; row++){
             
             for (int column = 0; column < columnSize; column++){
                 
                 destination.matrix[row][column] = source.matrix[row][column];
             }
         }
         
     }
     private float[][] add(Matrix matrixOne, Matrix matrixTwo) throws Exception{
         if (matrixOne.rowSize != matrixTwo.rowSize || matrixOne.columnSize != matrixTwo.columnSize){
             throw new Exception("The Matrices are not of equal size");
         }
         for (int row = 0; row < rowSize; row++){
             
             for (int column = 0; column < columnSize; column++){
                 
                 this.matrix[row][column] = matrixOne.matrix[row][column] + matrixTwo.matrix[row][column];
             }
         }
         return this.matrix;
     }
     private void print(Matrix matrix){
         
     }
     
}
