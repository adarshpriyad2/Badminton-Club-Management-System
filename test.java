import java.util.*;


class admin{
    HashMap<String,String> phn_name;
    HashMap<String,Double> phn_accBal;
    HashMap<String,String> phn_dop;
    // HashMap<String,Integer> phn_court;
    HashMap<Integer,Boolean> court=new HashMap<Integer,Boolean>();

    String phn;
    String name;
    double accountBal;

    int match_no;
    String p1_phn;
    String p2_phn;
    String date;
    String loser_phn;


    String player_phn;
    String dop;
    double amtpaid;
    admin()
    {
        // court.put(1,false);
        // court.put(2,false);
        // court.put(3,false);
        // court.put(4,false);
        // court.put(5,false);
        
    }

    admin(String phn,String name)
    {
        // 1// this.name=name;
        accountBal=0;
        phn_name=new HashMap<String,String>();
        phn_name.put(phn, name);
        phn_accBal=new HashMap<String,Double>();
        phn_accBal.put(phn, accountBal);
        phn_dop=new HashMap<String,String>();
        phn_dop.put(phn,"00-00-0000");
        
        // phn_court.put(phn,0);
        court.put(1,false);
        court.put(2,false);
        court.put(3,false);
        court.put(4,false);
        court.put(5,false);
        

    }

    void playerDetail(String phn)
    {
        if(phn_name.get(phn)==null)
        System.out.println("null data");

        String name=phn_name.get(phn);
        Double acc=phn_accBal.get(phn);
        System.out.println("\n\n Player Details:");
        System.out.println("Name : "+name);
        System.out.println("Phone no. : "+phn);
        System.out.println("Account Bal : "+acc);
        System.out.println("\n\n");

    }
    void MatchDetail(String phn1,String phn2,int court_no)
    {
        if(court.get(court_no)==true){
        System.out.println("Court "+court_no+" is already occupied");
        System.out.println("\n\n");}
        

        else{
            court.replace(court_no,true);
            // phn_court.replace(phn1,court_no);
            // phn_court.replace(phn2,court_no);

        }
        
    }

        void MatchDetail(int court_no)
    {
        if(court.get(court_no)==false){
        System.out.println("Court is not occupied");
        System.out.println("\n\n");}

        else{
            System.out.println("court no.: "+court_no);
            // String phn1=phn_court.keySet(court_no);
            
            // System.out.print("Player 1 Name :"+phn_name.get(phn1)+"\n");
            // System.out.print("Player 1 phnoe no. :"+phn1+"\n");
            
            // String phn2=phn_court.getKey(court_no);
            // System.out.print("Player 2 Name :"+phn_name.get(phn2)+"\n");
            // System.out.print("Player 2 phnoe no. :"+phn2+"\n");
            // System.out.println("\n\n");
        }
        
    }

    void paymentDetail(String phn,double amt,String date )
    {
        if(phn_name.get(phn)==null)
        System.out.println("null data");

        double tam=(phn_accBal.get(phn))+100-amt;
        phn_accBal.replace(phn,tam);
        
        phn_dop.replace(phn,date);
        System.out.println("Name :"+phn_name.get(phn));
        System.out.println("Phnoe no. : "+phn);
        System.out.println("Account balence : "+phn_accBal.get(phn));
        System.out.println("\n\n");

    }
    void del(String phn)
    {
        if(phn_name.get(phn)==null)
        System.out.println("null data");
        phn_accBal.remove(phn);
        // phn_court.remove(phn);
        phn_dop.remove(phn);
        phn_name.remove(phn);
    }

    public HashMap<String, String> getPhn_name() {
        return phn_name;
    }
    public void setPhn_name(HashMap<String, String> phn_name) {
        this.phn_name = phn_name;
    }
    public HashMap<String, Double> getPhn_accBal() {
        return phn_accBal;
    }
    public void setPhn_accBal(HashMap<String, Double> phn_accBal) {
        this.phn_accBal = phn_accBal;
    }
    public HashMap<String, String> getPhn_dop() {
        return phn_dop;
    }
    public void setPhn_dop(HashMap<String, String> phn_dop) {
        this.phn_dop = phn_dop;
    }
    public HashMap<Integer, Boolean> getCourt() {
        return court;
    }
    public void setCourt(HashMap<Integer, Boolean> court) {
        this.court = court;
    }
    public String getPhn() {
        return phn;
    }
    public void setPhn(String phn) {
        this.phn = phn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAccountBal() {
        return accountBal;
    }
    public void setAccountBal(double accountBal) {
        this.accountBal = accountBal;
    }
    public int getMatch_no() {
        return match_no;
    }
    public void setMatch_no(int match_no) {
        this.match_no = match_no;
    }
    public String getP1_phn() {
        return p1_phn;
    }
    public void setP1_phn(String p1_phn) {
        this.p1_phn = p1_phn;
    }
    public String getP2_phn() {
        return p2_phn;
    }
    public void setP2_phn(String p2_phn) {
        this.p2_phn = p2_phn;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLoser_phn() {
        return loser_phn;
    }
    public void setLoser_phn(String loser_phn) {
        this.loser_phn = loser_phn;
    }
    public String getPlayer_phn() {
        return player_phn;
    }
    public void setPlayer_phn(String player_phn) {
        this.player_phn = player_phn;
    }
    public String getDop() {
        return dop;
    }
    public void setDop(String dop) {
        this.dop = dop;
    }
    public double getAmtpaid() {
        return amtpaid;
    }
    public void setAmtpaid(double amtpaid) {
        this.amtpaid = amtpaid;
    }


}
///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
public class test {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        admin player=new admin();
        String phn="null";

        ArrayList<admin> arr=new ArrayList<admin>();

        HashMap<String,admin> h=new HashMap<String,admin>();
                    
        char ch='z';
        do{
        //     System.out.print("enter the player no :");
        // int i=sc.nextInt();
        System.out.println("\nenter the choice :");
        System.out.println("\nfor new player entry enter '1'");
        System.out.println("for player detail enter '2'");
        System.out.println("for match entry enter '3'");
        System.out.println("for match detail enter '4'");
        System.out.println("for payment entry enter '5'");
        System.out.println("for deleting a player enter '6'");
        System.out.println("\n\n");

        
        int choi=sc.nextInt(); 
        System.out.print("Enter the phone no :");
        if(choi!=4)
        phn=sc.next();

        

            switch (choi) {
            case 1: 
            System.out.println("enter the details of new player");
            System.out.print("enter the name : ");
            String name1=sc.next();
            // System.out.print("enter the phone no. : ");
            // String phn3=sc.next();  
            player=new admin(phn, name1);
            // arr.add(player);
            h.put(phn,player);
            
                break;

            case 2:System.out.println("enter the player ph no. : ");
                   String phn1=phn;
                   h.get(phn).playerDetail(phn1);
                //    player.;
                   break;
            case 3:System.out.println("for Match deatil entery the court no");
                    int Match_deatil_entery_court_no=sc.nextInt();
                    // System.out.println("enter the phone no for player 1 : ");
                    // String Match_deatil_entery_phn1=sc.next();
                    System.out.println("enter the phone no for player 2 : ");
                    String Match_deatil_entery_phn2=sc.next();
                    h.get(phn).MatchDetail(phn, Match_deatil_entery_phn2, Match_deatil_entery_court_no);
                    break;
            case 4:System.out.println("for Match detail enter the court no.:");
                    int court_no=sc.nextInt();
                    h.get(phn).MatchDetail(court_no);
                    break;
            case 5:System.out.println("payment detail");
                    // System.out.println("enter the phn :");
                    // String payment_detail_phn=sc.next();        
                    System.out.println("enter the date:");
                    String date=sc.next();
                    System.out.println("enter the amount paid :");
                    double amt=sc.nextDouble();
                    h.get(phn).paymentDetail(phn, amt, date);
                    break;

            case 6:
            // System.out.print("To delete the player enter the phone no:");
                    // String del_phn=sc.next();
                    h.get(phn).del(phn);
                break;

        }
        System.out.println("\n");
        System.out.print("to repeat press 'r'");
        System.out.println("\n");

        ch=sc.next().charAt(0);
        }while( ch=='r');
        
        
    }
}
