
package similarity;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class hfkata extends DocSimilarity {

    
//        String txt1 = Text1.toLowerCase();
//        String txt2 = Text2.toLowerCase();
//        
//        String[] stopSymbols = {"\\.", "\\,", "\\-"};
//        for (int i = 0; i < stopSymbols.length; i++) {
//            String exSymbol = stopSymbols[i];
//            txt1 = txt1.replaceAll(exSymbol," ");
//            txt2 = txt2.replaceAll(exSymbol," ");
//            
//        }
//        
//        String[] stopWords = {"dan", "atau", "dari", "ini", "di", "untuk"};
//        for (int i = 0; i < stopWords.length; i++) {
//            String exText = stopWords[i];
//            txt1 = txt1.replaceAll("\\s+" + exText + "\\s+"," ");
//            txt2 = txt2.replaceAll("\\s+" + exText + "\\s+"," ");
//            
//        }
//        txt1 = txt1.replaceAll("\\s+", " ");
//        txt2 = txt2.replaceAll("\\s+", " ");
//            
//        String[] Words1 = txt1.split("\\s+");
//        String[] Words2 = txt2.split("\\s+");
//        
//        ArrayList<Token> tokens = new ArrayList<>();
//        
//        for(String kata : Words1){
//            if(kata.length()>0){
//                boolean ada = false;
//                for(Token token : tokens){
//                    if(kata.equalsIgnoreCase(Words1)){
//                        token.increaseFrequency(1);
//                        ada=true;
//                        break;
//                    }
//                }
//            }
//        }
    
// ==============================================================================================

//            dotProduct += (double) (Math.pow((dict1.get(Words1[i]))-(dict2.get(Words2[i])), 2));        
//            }
//            System.out.println("dict1 : " + dict1.keySet());
//            System.out.println("dict2 : " + dict2.keySet());

//
//            dotProduct = dotProduct + (dict1.get(Words1[i]))*(dict2.get(Words1[i]));
//            doc1sq = doc1sq + (dict1.get(Words1[i]))*(dict1.get(Words1[i]));
//            doc2sq = doc2sq + (dict2.get(Words1[i]))*(dict2.get(Words1[i]));
//            
        
//        double similarity = Math.sqrt(dotProduct);
//        finalResult.setText(String.valueOf(similarity));

//        
//        PreparedStatement st;
//        ResultSet rs;
//        
//        
//        for (int i = 0; i < Words1.length; i++) {
//        String jumlah1 = String.valueOf(dict1.get(Words1[i]));
//        String jumlah2 = String.valueOf(dict2.get(Words2[i]));
////        String doc1 =  String.valueOf(dict1.get());
////        String doc2 =  String.valueOf(dict1.get());
////        
//        String query = "SELECT * FROM `mydictionary` WHERE `nisnip` = ? AND `password` = ?";
//
//        try {
//            st = Connect.getConnection().prepareStatement(query);
//
////            st.setString(1, doc1);
//            st.setString(2, jumlah1);
//            st.setString(3, doc2);
//            st.setString(4, jumlah2);
//
//            rs = st.executeQuery();
//
//            } catch (SQLException ex) {
//            Logger.getLogger(DocSimilarity.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        
//        ArrayList hasilfr = new ArrayList<>();
//        for (int i = 0; i < cleanTokens.size(); i++) {
//            if (cleanTokens.get(i).equals(cleanTokens2.get(i))) {
//                hasilfr.add(String.valueOf(sqrt(Math.pow((double) fr.get(i), 2) - Math.pow((double) fr2.get(i), 2))));
//
//            }
//
//        }
//        ArrayList hasilfr = new ArrayList<>();
//        for (int i = 0; i < fr.size() + fr2.size(); i++) {
//            double hsl = 0;
//            hasilfr.add(String.valueOf(sqrt(Math.pow((double) fr.get(i), 2) - Math.pow((double) fr2.get(i), 2))));
//        }
//        finalResult.setText(String.valueOf(hasilfr));
//        Map<String, Integer> frekuensi = new HashMap<>();
//        for (Map.Entry<String, Integer> token : frekuensi.entrySet()) {
//            String key = token.getKey();
//            Integer value = token.getValue();
//            txtTF1.setText(String.valueOf(key + " " + value));
//        }      
////        
//        while(Text1 != null){
//            if(!cleanTokens.equals(" ")){
//                for (String token : tokens2) {
//                    if(frekuensi.containsKey(token)){
//                        frekuensi.put(token,
//                                frekuensi.get(token)+1);
//                    }else{
//                        frekuensi.put(token,1);
//                    }
//                }
//            }txtTF1.setText(String.valueOf(cleanTokens +" "+ frekuensi)); 
//           
//        }
//        txtresult1.setText(String.valueOf(frekuensi));
//        
//        int mostFrequentlyUsed = 0;
//        String theword = null;
//        
//        for (String word : frekuensi.keySet()) {
//            Integer theval = frekuensi.get(word);
//            if(theval > mostFrequentlyUsed){
//                mostFrequentlyUsed= theval;
//                theword = word;
//            }    
//        }
//        
//        HashMap<String, Integer> TF = new HashMap<String, Integer>();
//        StringTokenizer st = new StringTokenizer(Text1," ");
//        String term;
//        Integer freq;
//        while(st.hasMoreTokens()){
//            term = st.nextToken();
//            if(!(TF.containsKey(term))){
//                TF.put(term,0);
//            }
//            freq = TF.get(term);
//            TF.put(term, freq+1);
//        }
//        for (String key : TF.keySet()) {
//            txtresult1.setText(key+" "+TF.get(key));
//            
//        }
//        ArrayList baru = new ArrayList();
//        ArrayList frekuensi1 = new ArrayList();
//        ArrayList frekuensi2 = new ArrayList();
//        ArrayList baru2 = new ArrayList();
//        ArrayList hasil = new ArrayList();
//
//        int frekuensi = 1;
//        int f;
//
//        for (int i = 0; i <= (Words1.length/2); i++) {
//            String kata = Words1[i];
//            for (int j = (Words1.length/2 + 1); j < Words1.length; j++) {
//                String kasel = Words1[j];
//                if (!kata.equals(kasel)) {
//                    f = frekuensi;
//                } else {
//                    f = frekuensi + 1;
//                }
//                baru.add(Words1[j] + f);
//                frekuensi1.add(f);
//                txtresult1.setText(String.valueOf(baru));
//            }
//
//        }
//        for (int i = 0; i <= (Words2.length/2); i++) {
//            String kata2 = Words2[i];
//            for (int j = (Words2.length/2 + 1); j < Words2.length; j++) {
//                String kasel2 = Words2[j];
//                if (kata2.equals(kasel2)) {
//                    f = frekuensi + 1;
//                } else {
//                    f = frekuensi;
//                    baru2.add(Words2[j] + f);
//                }
//                frekuensi2.add(f);
//                txtResult2.setText(String.valueOf(baru2));
//            }
//
//        }
//        for (int i = 0; i < frekuensi1.size(); i++) {
//            double hsl = 0;
//            hasil.add(sqrt(Math.pow((int) frekuensi2.get(i) - (int) frekuensi1.get(i), 2)));
//            finalResult.setText(String.valueOf(hasil));
//        }
//        frekuensi = cleanTokens.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
//    =============================================================================================================
    public static void printMap(HashMap<String, Integer> dict) {
        System.out.println("=======printing dictionary(key.value)===");
        for (String key : dict.keySet()) {
            System.out.println(key + " : " + dict.get(key));
        }
    }
//==================================================================================================================
    //        String[] stopSymbols = {"\\.", "\\,", "\\-"};
//            if (Words1.contais(stopSymbols)) {
//                String 
//            }
//            exSymbol = stopSymbols[i];
//            String text1 = Text1.replaceAll(exSymbol, " ");
//
//        }
//    =======================================================================================
    
//        String[] stopSymbols = {"\\.", "\\,", "\\-", "\\:", "\\'", "\\?","\\:", "\\'", "\\?", "\\!", "\\@", 
//                                "\\#", "\\$", "\\%", "\\&", "\\*", "\\(", "\\)", "\\+", "\\=", "\\{", "\\}", 
//                                "\\[", "\\]", "\\<", "\\>", "\\|", "\\~", "\\`"};
//        
//        for (int i = 0; i < wordsList1.size(); i++) {
//            for (int j = 0; j < stopSymbols.length; j++) {
//                if(stopSymbols[j].contains(wordsList1.get(i))){
//                wordsList1.remove(i);
//                }
//            }
//        }    
//        
//        for (int i = 0; i < wordsList2.size(); i++) {
//            for (int j = 0; j < stopSymbols.length; j++) {
//                if(stopSymbols[j].contains(wordsList2.get(i))){
//                wordsList2.remove(i);
//                }
//            }
//        }
//        
//        for(String str : wordsList1){
//            System.out.println(str + "");
//        }
//        
//        for(String str : wordsList2){
//            System.out.println(str + "");
//        }
//        for (int i = 0; i < stopWords.length; i++) {
//            String exText = stopWords[i];
//            String text1 = Text1.replaceAll("\\s+" + exText + "\\s+", " ");
//
//        }
    
//   =================================================================================
    //
//        String[] stopSymbols2 = {"\\.", "\\,", "\\-", "\\'", "\\(", "\\)", "\\-"};
//        for (int i = 0; i < stopSymbols2.length; i++) {
//            String exSymbol = stopSymbols2[i];
//            String text2 = Text2.replaceAll(exSymbol, " ");
//
//        }
//
//        String[] stopWords2 = {"dan", "atau", "dari", "ini", "di", "untuk"};
//        for (int i = 0; i < stopWords2.length; i++) {
//            String exText = stopWords2[i];
//            String text2 = Text2.replaceAll("\\s+" + exText + "\\s+", " ");
//
//        }

//===================================================================================
    
//        String[] tokens = Text1.trim().split(" ");
//
//        List<String> cleanTokens = new ArrayList<>();
//
//        for (String token : tokens) {
//            String cleanToken = token.trim().toLowerCase().replaceAll("\\s+", "");
//            if (cleanToken.length() > minTokenSize) {
//                cleanTokens.add(cleanToken);
//            }
//            txtToken1.setText(String.valueOf(cleanTokens));
//        }
//
//        String[] tokens2 = Text2.trim().split(" ");
//        List<String> cleanTokens2 = new ArrayList<>();
//
//        for (String token : tokens2) {
//            String cleanToken2 = token.trim().toLowerCase().replaceAll("\\s+", "");
//            if (cleanToken2.length() > minTokenSize) {
//                cleanTokens2.add(cleanToken2);
//            }
//            txtToken2.setText(String.valueOf(cleanTokens2));
//        }
//        List<String> hasil = new ArrayList<>();
//        ArrayList fr = new ArrayList<>();
//        for (String s : cleanTokens) {
//            fr.add(Collections.frequency(cleanTokens, s));
//            hasil.add(String.valueOf(s + " : " + Collections.frequency(cleanTokens, s)));
//            txtTF1.setText(String.valueOf(hasil));
//        }
//
//        List<String> hasil2 = new ArrayList<>();
//        ArrayList fr2 = new ArrayList<>();
//        for (String s2 : cleanTokens2) {
//            fr2.add(Collections.frequency(cleanTokens2, s2));
//            hasil2.add(String.valueOf(s2 + " : " + Collections.frequency(cleanTokens2, s2)));
//            txtTF2.setText(String.valueOf(hasil2));
//        }
//
    
}
