package RunTime;
import java.util.Random; 
import java.util.Arrays;
import javax.swing.JOptionPane;

public class RunTime extends javax.swing.JFrame {
    
    String arrValues = null ;
    int arr[] = new int[10000];

    public RunTime() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        ArrayLength_Label = new javax.swing.JLabel();
        arrayLength = new javax.swing.JTextField();
        EnterNumber = new javax.swing.JLabel();
        Value = new javax.swing.JTextField();
        ViewArray = new javax.swing.JButton();
        Binary = new javax.swing.JLabel();
        Jump = new javax.swing.JLabel();
        Linear = new javax.swing.JLabel();
        Interpolation = new javax.swing.JLabel();
        BinaryTest = new javax.swing.JButton();
        JumpTest = new javax.swing.JButton();
        LinearTest = new javax.swing.JButton();
        InterpolationTest = new javax.swing.JButton();
        BinaryCode = new javax.swing.JButton();
        JumpCode = new javax.swing.JButton();
        LinearCode = new javax.swing.JButton();
        InterpolationCode = new javax.swing.JButton();
        RTJump = new javax.swing.JTextField();
        RTBinary = new javax.swing.JTextField();
        RTLinear = new javax.swing.JTextField();
        RTInterpolation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Code = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Array = new javax.swing.JTextArea();
        SourceCodeLabel = new javax.swing.JLabel();
        ArrayLAbel = new javax.swing.JLabel();
        RuntimeLabel = new javax.swing.JLabel();
        Message = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        checkIndex = new javax.swing.JLabel();
        ValueAtIndex = new javax.swing.JTextField();
        checkArray = new javax.swing.JTextField();
        checkIndex1 = new javax.swing.JLabel();
        check = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        Header.setFont(new java.awt.Font("Papyrus", 3, 48)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Check Run Time");

        ArrayLength_Label.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        ArrayLength_Label.setForeground(new java.awt.Color(153, 255, 255));
        ArrayLength_Label.setText("Set Array Length          : ");

        arrayLength.setBackground(new java.awt.Color(0, 0, 0));
        arrayLength.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        arrayLength.setForeground(new java.awt.Color(153, 204, 0));
        arrayLength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        arrayLength.setText("0");
        arrayLength.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        arrayLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrayLengthActionPerformed(evt);
            }
        });

        EnterNumber.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        EnterNumber.setForeground(new java.awt.Color(153, 255, 255));
        EnterNumber.setText("Enter Number              : ");

        Value.setBackground(new java.awt.Color(0, 0, 0));
        Value.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Value.setForeground(new java.awt.Color(153, 204, 0));
        Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Value.setText("0");
        Value.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueActionPerformed(evt);
            }
        });

        ViewArray.setBackground(new java.awt.Color(51, 204, 0));
        ViewArray.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ViewArray.setForeground(new java.awt.Color(255, 255, 255));
        ViewArray.setText("View Array");
        ViewArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewArrayActionPerformed(evt);
            }
        });

        Binary.setBackground(new java.awt.Color(0, 0, 0));
        Binary.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        Binary.setForeground(new java.awt.Color(153, 255, 255));
        Binary.setText("Binary Search");
        Binary.setMaximumSize(new java.awt.Dimension(173, 27));
        Binary.setMinimumSize(new java.awt.Dimension(173, 27));
        Binary.setPreferredSize(new java.awt.Dimension(173, 27));

        Jump.setBackground(new java.awt.Color(0, 0, 0));
        Jump.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        Jump.setForeground(new java.awt.Color(153, 255, 255));
        Jump.setText("Jump Search");

        Linear.setBackground(new java.awt.Color(0, 0, 0));
        Linear.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        Linear.setForeground(new java.awt.Color(153, 255, 255));
        Linear.setText("Linear Search");

        Interpolation.setBackground(new java.awt.Color(0, 0, 0));
        Interpolation.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        Interpolation.setForeground(new java.awt.Color(153, 255, 255));
        Interpolation.setText("Interpolation Search");

        BinaryTest.setBackground(new java.awt.Color(0, 51, 255));
        BinaryTest.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BinaryTest.setForeground(new java.awt.Color(255, 255, 255));
        BinaryTest.setText("Test");
        BinaryTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinaryTestActionPerformed(evt);
            }
        });

        JumpTest.setBackground(new java.awt.Color(0, 51, 255));
        JumpTest.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JumpTest.setForeground(new java.awt.Color(255, 255, 255));
        JumpTest.setText("Test");
        JumpTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumpTestActionPerformed(evt);
            }
        });

        LinearTest.setBackground(new java.awt.Color(0, 51, 255));
        LinearTest.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LinearTest.setForeground(new java.awt.Color(255, 255, 255));
        LinearTest.setText("Test");
        LinearTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinearTestActionPerformed(evt);
            }
        });

        InterpolationTest.setBackground(new java.awt.Color(0, 51, 255));
        InterpolationTest.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        InterpolationTest.setForeground(new java.awt.Color(255, 255, 255));
        InterpolationTest.setText("Test");
        InterpolationTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterpolationTestActionPerformed(evt);
            }
        });

        BinaryCode.setBackground(new java.awt.Color(0, 102, 102));
        BinaryCode.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BinaryCode.setForeground(new java.awt.Color(255, 255, 255));
        BinaryCode.setText("View Code");
        BinaryCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinaryCodeActionPerformed(evt);
            }
        });

        JumpCode.setBackground(new java.awt.Color(0, 102, 102));
        JumpCode.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JumpCode.setForeground(new java.awt.Color(255, 255, 255));
        JumpCode.setText("View Code");
        JumpCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumpCodeActionPerformed(evt);
            }
        });

        LinearCode.setBackground(new java.awt.Color(0, 102, 102));
        LinearCode.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LinearCode.setForeground(new java.awt.Color(255, 255, 255));
        LinearCode.setText("View Code");
        LinearCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinearCodeActionPerformed(evt);
            }
        });

        InterpolationCode.setBackground(new java.awt.Color(0, 102, 102));
        InterpolationCode.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        InterpolationCode.setForeground(new java.awt.Color(255, 255, 255));
        InterpolationCode.setText("View Code");
        InterpolationCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterpolationCodeActionPerformed(evt);
            }
        });

        RTJump.setBackground(new java.awt.Color(0, 0, 0));
        RTJump.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        RTJump.setForeground(new java.awt.Color(204, 204, 204));
        RTJump.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTJump.setText("0");
        RTJump.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        RTJump.setEnabled(false);
        RTJump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTJumpActionPerformed(evt);
            }
        });

        RTBinary.setBackground(new java.awt.Color(0, 0, 0));
        RTBinary.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        RTBinary.setForeground(new java.awt.Color(204, 204, 204));
        RTBinary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTBinary.setText("0");
        RTBinary.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        RTBinary.setEnabled(false);
        RTBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTBinaryActionPerformed(evt);
            }
        });

        RTLinear.setBackground(new java.awt.Color(0, 0, 0));
        RTLinear.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        RTLinear.setForeground(new java.awt.Color(204, 204, 204));
        RTLinear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTLinear.setText("0");
        RTLinear.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        RTLinear.setEnabled(false);
        RTLinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTLinearActionPerformed(evt);
            }
        });

        RTInterpolation.setBackground(new java.awt.Color(0, 0, 0));
        RTInterpolation.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        RTInterpolation.setForeground(new java.awt.Color(204, 204, 204));
        RTInterpolation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RTInterpolation.setText("0");
        RTInterpolation.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        RTInterpolation.setEnabled(false);
        RTInterpolation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTInterpolationActionPerformed(evt);
            }
        });

        Code.setBackground(new java.awt.Color(0, 0, 0));
        Code.setColumns(20);
        Code.setForeground(new java.awt.Color(255, 255, 0));
        Code.setRows(5);
        Code.setDisabledTextColor(new java.awt.Color(102, 255, 0));
        Code.setEnabled(false);
        jScrollPane1.setViewportView(Code);

        Array.setBackground(new java.awt.Color(0, 0, 0));
        Array.setColumns(20);
        Array.setForeground(new java.awt.Color(255, 255, 0));
        Array.setRows(5);
        Array.setText("   Please set an array length maximum of 10000");
        Array.setDisabledTextColor(new java.awt.Color(102, 255, 0));
        Array.setEnabled(false);
        jScrollPane3.setViewportView(Array);

        SourceCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        SourceCodeLabel.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        SourceCodeLabel.setForeground(new java.awt.Color(153, 255, 255));
        SourceCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SourceCodeLabel.setText("Source Code");
        SourceCodeLabel.setMaximumSize(new java.awt.Dimension(173, 27));
        SourceCodeLabel.setMinimumSize(new java.awt.Dimension(173, 27));
        SourceCodeLabel.setPreferredSize(new java.awt.Dimension(173, 27));

        ArrayLAbel.setBackground(new java.awt.Color(0, 0, 0));
        ArrayLAbel.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        ArrayLAbel.setForeground(new java.awt.Color(153, 255, 255));
        ArrayLAbel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArrayLAbel.setText("The Array ");
        ArrayLAbel.setMaximumSize(new java.awt.Dimension(173, 27));
        ArrayLAbel.setMinimumSize(new java.awt.Dimension(173, 27));
        ArrayLAbel.setPreferredSize(new java.awt.Dimension(173, 27));

        RuntimeLabel.setBackground(new java.awt.Color(0, 0, 0));
        RuntimeLabel.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        RuntimeLabel.setForeground(new java.awt.Color(153, 255, 255));
        RuntimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RuntimeLabel.setText("Runtime");
        RuntimeLabel.setMaximumSize(new java.awt.Dimension(173, 27));
        RuntimeLabel.setMinimumSize(new java.awt.Dimension(173, 27));
        RuntimeLabel.setPreferredSize(new java.awt.Dimension(173, 27));

        Message.setBackground(new java.awt.Color(0, 0, 0));
        Message.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Message.setForeground(new java.awt.Color(204, 204, 204));
        Message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Message.setText("Output Message will be shown here");
        Message.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        Message.setEnabled(false);
        Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(153, 51, 0));
        Reset.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        checkIndex.setBackground(new java.awt.Color(0, 0, 0));
        checkIndex.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        checkIndex.setForeground(new java.awt.Color(153, 255, 255));
        checkIndex.setText("Check array index              :");

        ValueAtIndex.setBackground(new java.awt.Color(0, 0, 0));
        ValueAtIndex.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        ValueAtIndex.setForeground(new java.awt.Color(204, 204, 204));
        ValueAtIndex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ValueAtIndex.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        ValueAtIndex.setEnabled(false);
        ValueAtIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueAtIndexActionPerformed(evt);
            }
        });

        checkArray.setBackground(new java.awt.Color(0, 0, 0));
        checkArray.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        checkArray.setForeground(new java.awt.Color(153, 204, 0));
        checkArray.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checkArray.setText("0");
        checkArray.setDisabledTextColor(new java.awt.Color(153, 204, 0));
        checkArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkArrayActionPerformed(evt);
            }
        });

        checkIndex1.setBackground(new java.awt.Color(0, 0, 0));
        checkIndex1.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        checkIndex1.setForeground(new java.awt.Color(153, 255, 255));
        checkIndex1.setText("View element                     :");

        check.setBackground(new java.awt.Color(0, 102, 102));
        check.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EnterNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ArrayLength_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(arrayLength, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(ViewArray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArrayLAbel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Message, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Linear, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(LinearTest, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(LinearCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Interpolation, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Jump, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Binary, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(InterpolationTest, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(InterpolationCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(JumpTest, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(BinaryTest, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(BinaryCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JumpCode))))))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RTBinary, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(RTJump, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(RTLinear, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(RTInterpolation, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(RuntimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkIndex1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ValueAtIndex)
                                    .addComponent(checkArray, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(Reset))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SourceCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Header)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ArrayLength_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrayLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewArray))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EnterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(ArrayLAbel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SourceCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RuntimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Binary, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BinaryTest)
                            .addComponent(RTBinary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BinaryCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jump, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JumpTest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JumpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RTJump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Linear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LinearTest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LinearCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RTLinear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Interpolation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InterpolationTest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InterpolationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RTInterpolation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reset)
                            .addComponent(ValueAtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkIndex1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RTInterpolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTInterpolationActionPerformed
        
    }//GEN-LAST:event_RTInterpolationActionPerformed

    private void RTLinearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTLinearActionPerformed
       
    }//GEN-LAST:event_RTLinearActionPerformed

    private void RTBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTBinaryActionPerformed
       
    }//GEN-LAST:event_RTBinaryActionPerformed

    private void RTJumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTJumpActionPerformed
       
    }//GEN-LAST:event_RTJumpActionPerformed

    private void InterpolationCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterpolationCodeActionPerformed
        String code =   "int beginIndex = 0 , endIndex = length-1, pos ;\n" +
                        "start=System.nanoTime();\n" +
                        "while(beginIndex <= endIndex && Search>=arr[beginIndex] && Search<=arr[endIndex]){\n" +
                        "      pos = beginIndex + (((endIndex-beginIndex)*(Search-arr[beginIndex]))/(arr[endIndex]-arr[beginIndex]));\n" +
                        "               if(Search==arr[pos]){\n" +
                        "                       indexFound = pos ;\n" +
                        "                       break ;\n" +
                        "               }\n" +
                        "               else if(Search<arr[pos]){endIndex = pos-1;}\n" +
                        "               else {beginIndex=pos+1;}\n" +
                        "      }\n" +
                        "      end = System.nanoTime();\n" +
                        "      RTInterpolation.setText(String.valueOf(end-start));\n" +
                        "      Message.setText((indexFound==-1)? \"Element not found\" :\"Element found at index :\" + String.valueOf(indexFound));\n" +
                        "                break ;";
        Code.setText(code);
    }//GEN-LAST:event_InterpolationCodeActionPerformed

    private void LinearCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinearCodeActionPerformed
        String code ="start = System.nanoTime();\n" +
                    "for(int x=0;x<length;x++){\n" +
                    "       if(Search == arr[x]){\n" +
                    "               indexFound = x ;\n" +
                    "               break ;\n" +
                    "       }\n" +
                    "}\n" +
                    "end = System.nanoTime();\n" +
                    "RTLinear.setText(String.valueOf(end-start));\n" +
                    "Message.setText((indexFound==-1)? \"Element not found\" :\"Element found at index :\" + String.valueOf(indexFound));\n" +
                    "";
        Code.setText(code);
    }//GEN-LAST:event_LinearCodeActionPerformed

    private void JumpCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumpCodeActionPerformed
        String code =   "int block = (int)Math.floor(Math.sqrt(length));\n" +
                        "int jump =block-1 ;\n" +
                        "indexFound = -1;\n" +
                        "start = System.nanoTime();\n" +
                        "while(jump <= length){\n" +
                        "       if(Search==arr[jump]){\n" +
                        "               indexFound = jump;\n" +
                        "               break;\n" +
                        "       }\n" +
                        "       else if(Search<arr[jump]){\n" +
                        "               for(int x=(jump-block+1);x<jump;x++){\n" +
                        "                       if(Search ==arr[x]) {\n" +
                        "                                indexFound=x ;\n" +
                        "                                break ;\n" +
                        "                       }\n" +
                        "               }\n" +
                        "               break;\n" +
                        "       }\n" +
                        "       else{\n" +
                        "               jump=jump+block;\n" +
                        "               if(jump>length && jump!=length)jump=length ;\n" +
                        "       }\n" +
                        "}\n" +
                        "end = System.nanoTime();\n" +
                        "RTJump.setText(String.valueOf(end-start));\n" +
                        "Message.setText((indexFound==-1)? \"Element not found\" :\"Element found at index :\" + String.valueOf(indexFound));\n" +
                        "break ;\n" +
"                ";
        Code.setText(code);
    }//GEN-LAST:event_JumpCodeActionPerformed

    private void BinaryCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinaryCodeActionPerformed
        String code =   "int arrEnd = length , arrBeg = 0 , mid = (arrEnd-arrBeg)/2 ;\n" +
                        "indexFound = -1;\n" +
                        "start = System.nanoTime();\n" +
                        "while(arrBeg<=arrEnd-1){\n" +
                        "       if(Search == arr[mid]){\n" +
                        "               indexFound = mid ;\n" +
                        "               break ;\n" +
                        "       }\n" +
                        "       else if(Search > arr[mid]){arrBeg=++mid ;}\n" +
                        "       else{arrEnd=--mid ;}\n" +
                        "       mid = (arrEnd+arrBeg)/2 ;\n" +
                        "}\n" +
                        "end = System.nanoTime();\n" +
                        "RTBinary.setText(String.valueOf(end-start));                \n" +
                        "Message.setText((indexFound==-1)? \"Element not found\" :\"Element found at index :\" + String.valueOf(indexFound));\n" +
"                break ;";
        Code.setText(code);
    }//GEN-LAST:event_BinaryCodeActionPerformed

    private void InterpolationTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterpolationTestActionPerformed
       Declare(4);
    }//GEN-LAST:event_InterpolationTestActionPerformed

    private void LinearTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinearTestActionPerformed
       Declare(3);
    }//GEN-LAST:event_LinearTestActionPerformed

    private void JumpTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumpTestActionPerformed
       Declare(2);
    }//GEN-LAST:event_JumpTestActionPerformed

    private void BinaryTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinaryTestActionPerformed
       Declare(1);
    }//GEN-LAST:event_BinaryTestActionPerformed

    private void arrayLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrayLengthActionPerformed
    
    }//GEN-LAST:event_arrayLengthActionPerformed

    private void ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValueActionPerformed

    private void ViewArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewArrayActionPerformed
        if(arrValues ==null && arrayLength.getText().equals("0")==false ){
        createArray();
        Array.setText(arrValues);
        }
        else if(arrValues ==null && arrayLength.getText().equals("0")== true ){
        JOptionPane.showMessageDialog(null,"Please set an ArrayLength");
        }
        else {
        JOptionPane.showMessageDialog(null,"Already Created an array! Click Reset to Create a new array");
        }
        
    }//GEN-LAST:event_ViewArrayActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
       arrValues = null ;
       arrayLength.setText("0");
       Value.setText("0");
       RTBinary.setText("0");
       RTJump.setText("0");
       RTLinear.setText("0");
       RTInterpolation.setText("0");
       Code.setText("");
       Array.setText("   Please set an array length maximum of 10000");
       Message.setText("Output message will be shown here");
       
    }//GEN-LAST:event_ResetActionPerformed

    private void MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageActionPerformed

    }//GEN-LAST:event_MessageActionPerformed

    private void ValueAtIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueAtIndexActionPerformed

    }//GEN-LAST:event_ValueAtIndexActionPerformed

    private void checkArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkArrayActionPerformed
        
    }//GEN-LAST:event_checkArrayActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
         ValueAtIndex.setText(String.valueOf(arr[Integer.parseInt(checkArray.getText())]));
    }//GEN-LAST:event_checkActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
                RunTime runtime = new RunTime();
                runtime.setLocationRelativeTo(null);
                runtime.setVisible(true);
            }
        });
    }
    
    public void createArray(){
        int lineLength = 1 ;
        Random rd = new Random();
        int value = Integer.parseInt(arrayLength.getText());
        arrValues = " {" ;
        for(int x=0 ; x<value ; x++){
            arr[x] = rd.nextInt(value);
            if(lineLength%24 != 0){arrValues = arrValues + " " + String.valueOf(arr[x])+ " ,";}
            else{arrValues = arrValues + " " + String.valueOf(arr[x])+ "\n ";}
            lineLength++ ;
        }
        arrValues = arrValues + "}" ;
        Arrays.sort(arr,0,value);
                
    }
    
    public void Declare(int method){
        int indexFound = -1 ;
        long start , end ;
        int length = Integer.parseInt(arrayLength.getText());
        int Search = Integer.parseInt(Value.getText());
        
        if(arrValues==null){
            createArray();
        }
        
        switch (method) {
            case 1 :
                int arrEnd = length , arrBeg = 0 , mid = (arrEnd-arrBeg)/2 ;
                indexFound = -1;
                start = System.nanoTime();
                while(arrBeg<=arrEnd-1){
                    if(Search == arr[mid]){
                        indexFound = mid ;
                        break ;
                    }
                    else if(Search > arr[mid]){arrBeg=++mid ;}
                    else{arrEnd=--mid ;}
                    mid = (arrEnd+arrBeg)/2 ;
                }
                end = System.nanoTime();
                RTBinary.setText(String.valueOf(end-start));                
                Message.setText((indexFound==-1)? "Element not found" :"Element found at index :" + String.valueOf(indexFound));
                break ;
                
            case 2 :
                int block = (int)Math.floor(Math.sqrt(length));
                int jump =block-1 ;
                indexFound = -1;
                start = System.nanoTime();
                while(jump <= length){
                    if(Search==arr[jump]){
                        indexFound = jump;
                        break;
                    }
                    else if(Search<arr[jump]){
                        for(int x=(jump-block+1);x<jump;x++){
                            if(Search ==arr[x]) {
                                indexFound=x ;
                                break ;
                            }
                        }
                        break;
                    }
                    else{
                        jump=jump+block;
                        if(jump>length && jump!=length)jump=length ;
                    }
                }
                end = System.nanoTime();
                RTJump.setText(String.valueOf(end-start));
                Message.setText((indexFound==-1)? "Element not found" :"Element found at index :" + String.valueOf(indexFound));
                break ;
                
            case 3 :
                start = System.nanoTime();
                for(int x=0;x<length;x++){
                    if(Search == arr[x]){
                        indexFound = x ;
                        break ;
                    }
                }
                end = System.nanoTime();
                RTLinear.setText(String.valueOf(end-start));
                Message.setText((indexFound==-1)? "Element not found" :"Element found at index :" + String.valueOf(indexFound));
                break ;
                
            case 4 : 
                int beginIndex = 0 , endIndex = length-1, pos ;
                start=System.nanoTime();
                while(beginIndex <= endIndex && Search>=arr[beginIndex] && Search<=arr[endIndex]){
                    pos = beginIndex + (((endIndex-beginIndex)*(Search-arr[beginIndex]))/(arr[endIndex]-arr[beginIndex]));
                    System.out.println("pos is :" + pos);
                    if(Search==arr[pos]){
                        indexFound = pos ;
                        break ;
                        }
                    else if(Search<arr[pos]){endIndex = pos-1;}
                    else {beginIndex=pos+1;}
                }
                end = System.nanoTime();
                RTInterpolation.setText(String.valueOf(end-start));
                Message.setText((indexFound==-1)? "Element not found" :"Element found at index :" + String.valueOf(indexFound));
                break ;   
            default : break ; 
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Array;
    private javax.swing.JLabel ArrayLAbel;
    private javax.swing.JLabel ArrayLength_Label;
    private javax.swing.JLabel Binary;
    private javax.swing.JButton BinaryCode;
    private javax.swing.JButton BinaryTest;
    private javax.swing.JTextArea Code;
    private javax.swing.JLabel EnterNumber;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Interpolation;
    private javax.swing.JButton InterpolationCode;
    private javax.swing.JButton InterpolationTest;
    private javax.swing.JLabel Jump;
    private javax.swing.JButton JumpCode;
    private javax.swing.JButton JumpTest;
    private javax.swing.JLabel Linear;
    private javax.swing.JButton LinearCode;
    private javax.swing.JButton LinearTest;
    private javax.swing.JTextField Message;
    private javax.swing.JTextField RTBinary;
    private javax.swing.JTextField RTInterpolation;
    private javax.swing.JTextField RTJump;
    private javax.swing.JTextField RTLinear;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel RuntimeLabel;
    private javax.swing.JLabel SourceCodeLabel;
    private javax.swing.JTextField Value;
    private javax.swing.JTextField ValueAtIndex;
    private javax.swing.JButton ViewArray;
    private javax.swing.JTextField arrayLength;
    private javax.swing.JButton check;
    private javax.swing.JTextField checkArray;
    private javax.swing.JLabel checkIndex;
    private javax.swing.JLabel checkIndex1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
