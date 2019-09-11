/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hassan Nasr
 */
public class ConnectMove {
    private int row;
    private int column;
    private ConnectFourEnum colour;
    
    /**
     *
     * @param row The row of the button to be changed to be used in the Application
     * @param column The column of the button to be changed to be used in the Application
     * @param colour The colour of the button to be changed to be used in the Application
     */
    public ConnectMove(int row, int column, ConnectFourEnum colour){
        this.row = row;
        this.column = column;
        this.colour = colour;
    }

    /**
     *
     * @return returns the row of the Button the be changed in the Application
     */
    public int getRow(){
        return this.row;
    }

    /**
     *
     * @return returns the column of the Button the be changed in the Application
     */
    public int getColumn(){
        return this.column;
    }

    /**
     *
     * @return returns the colour of the Button the be changed in the Application
     */
    public ConnectFourEnum getColour(){
        return this.colour;
    }    
}
