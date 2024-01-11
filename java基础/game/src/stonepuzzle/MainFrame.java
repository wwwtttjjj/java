package stonepuzzle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.jar.JarEntry;

public class MainFrame extends JFrame implements KeyListener {
    int [][] data = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int [][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int row;
    int colum;
    int count = 0;
    public MainFrame(){
        this.addKeyListener(this);
        initFrame();
        initData();
        paintView();
        setVisible(true);

    }
    public void initFrame(){
        setSize(514, 595);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("stone game");
//top
        setAlwaysOnTop(true);
//middle
        setLocationRelativeTo(null);
        setLayout(null);
    }
    public void paintView() {
        super.getContentPane().removeAll();

        //victory
        if (victory()){
            JLabel winLabel = new JLabel(new ImageIcon(
                    "C:\\Users\\10194\\Desktop\\java_study\\game\\image\\win.png"));
            winLabel.setBounds(124,230,266,88);
            getContentPane().add(winLabel);
        }
        //score
        JLabel scoreLabel = new JLabel("score:" + count);
        scoreLabel.setBounds(50,20,100,20);
        getContentPane().add(scoreLabel);
        //button
        JButton restart_btn = new JButton("restart");
        restart_btn.setBounds(350,20,100,20);
        getContentPane().add(restart_btn);
        restart_btn.setFocusable(false);
//        restart_btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                count = 0;
//                initData();
//                paintView();
//            }
//        });
        restart_btn.addActionListener(e -> {
            count = 0;
            initData();
            paintView();
        });


        //initial
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                JLabel imageLabel = new JLabel((new ImageIcon(
                        "C:\\Users\\10194\\Desktop\\java_study\\game\\image\\"+data[i][j]+".png")));
                imageLabel.setBounds(50 + 100 * j, 90 + 100 * i,100, 100);
                getContentPane().add(imageLabel);
            }
        }
        JLabel jl_back = new JLabel((new ImageIcon("C:\\Users\\10194\\Desktop\\java_study\\game\\image\\background.png")));
        jl_back.setBounds(26, 30,450, 484);
        getContentPane().add(jl_back);
        super.getContentPane().repaint();

    }
    public void initData(){
        Random r = new Random();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;
            }
        }
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                if (data[i][j] == 0){
                    row = i;
                    colum = j;
                }
            }
        }
//        System.out.println(row);
//        System.out.println(colum);

    }
    public boolean victory(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if (win[i][j] != data[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
@Override
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        move(keyCode);
        paintView();
}
//deal move methods
    private void move(int keyCode) {
        if (victory()){
            return;
        }
        if(keyCode == 37){
            if (colum == 3){
                return;
            }
            int temp = data[row][colum];
            data[row][colum] = data[row][colum + 1];
            data[row][colum + 1] = temp;
            colum ++;
            count ++;
        }
        else if(keyCode == 38){
            if (row == 3){
                return;
            }
            int temp = data[row][colum];
            data[row][colum] = data[row + 1][colum];
            data[row + 1][colum] = temp;
            row ++;
            count ++;

        }
        else if(keyCode == 39){
            if (colum == 0){
                return;
            }
            int temp = data[row][colum];
            data[row][colum] = data[row][colum - 1];
            data[row][colum - 1] = temp;
            colum --;
            count ++;

        }
        else if(keyCode == 40){
            if (row == 0){
                return;
            }
            int temp = data[row][colum];
            data[row][colum] = data[row - 1][colum];
            data[row - 1][colum] = temp;
            row --;
            count ++;

        }
        else if(keyCode == 90){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
        }
    }

    //_____________________________________
    public void keyTyped(KeyEvent e){

    };

    public void keyReleased(KeyEvent e){

    };
    //______________________________________
}
