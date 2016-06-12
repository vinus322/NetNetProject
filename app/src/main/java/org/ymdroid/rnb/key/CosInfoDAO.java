package org.ymdroid.rnb.key;

import org.ymdroid.rnb.R;

import java.util.ArrayList;
/**
 * Created by yj on 16. 6. 12..
 */
public class CosInfoDAO {

    private volatile static CosInfoDAO Instance = null;
    public ArrayList<CosInfo> cosInfos;
    public ArrayList<Review> reviews;
    public ArrayList<ArrayList<Review>> rvlist;
    //public String birth;

    private CosInfoDAO(){
        rvlist = new ArrayList<ArrayList<Review>>();
        cosInfos = new ArrayList<CosInfo>();
        makeTable();
    }

    public static CosInfoDAO getInstance(){
        if(Instance==null){
            synchronized (CosInfoDAO.class){
                if(Instance==null)
                    Instance = new CosInfoDAO();
            }
        }
        return Instance;
    }

    private void makeTable(){
        CosInfo A = new CosInfo(24,3);
        A.idx = 0;
        A.img = R.drawable.mamonde_extra_moisture_skin;
        A.name = "마몽드 엑스트라 모이스처 스킨";
        A.brand = "아모레퍼시픽";
        A.type = "스킨";
        A.lowPrice = 8910;
        A.highPrice = 26180;
        A.code = "792850136991";
        A.krIng[0] = "정제수";
        A.krIng[1] = "부틸렌글라이콜";
        A.krIng[2] = "에탄올";
        A.krIng[3] = "베타인";
        A.krIng[4] = "피이지/피피지-17/6코폴리머";
        A.krIng[5] = "디에톡시에칠석시네이트";
        A.krIng[6] = "눈연꽃추출물";
        A.krIng[7] = "하이알루로닉애씨드";
        A.krIng[8] = "세라마이드3";
        A.krIng[9] = "하이드롤라이즈드루핀프로테인";
        A.krIng[10] = "피이지-60하이드로제네이티드캐스터오일";
        A.krIng[11] = "흰목이버섯추출물";
        A.krIng[12] = "잔탄검";
        A.krIng[13] = "카보머";
        A.krIng[14] = "페녹시에탄올";
        A.krIng[15] = "하이드록시에칠아크릴레이트/소듐아크릴로일디메칠타우레이트코폴리머";
        A.krIng[16] = "페닐트리메치콘";
        A.krIng[17] = "셀룰로오스검";
        A.krIng[18] = "에칠헥실글리세린";
        A.krIng[19] = "글리세린";
        A.krIng[20] = "아크릴레이트/스테아릴메타크릴레이트코폴리머";
        A.krIng[21] = "트로메타민";
        A.krIng[22] = "디소듐이디티에이";
        A.krIng[23] = "향료";

        A.enIng[0] = "Water Aqua";
        A.enIng[1] = "Butylene Glycol";
        A.enIng[2] = "Alcohol";
        A.enIng[3] = "Betaine";
        A.enIng[4] = "PEG/PPG-17/6 Copolymer";
        A.enIng[5] = "Diethoxyethyl Succinate";
        A.enIng[6] = "Saussurea Involucrata Extract";
        A.enIng[7] = "Hyaluronic Acid ";
        A.enIng[8] = "Ceramide3";
        A.enIng[9] = "Hydrolyzed Lupine Protein";
        A.enIng[10] = "PEG-60 Hydrogenated Castor Oil";
        A.enIng[11] = "Tremella Fuciformis (Mushroom) Extract";
        A.enIng[12] = "Xanthan Gum";
        A.enIng[13] = "Carbomer";
        A.enIng[14] = "Phenoxyethanol";
        A.enIng[15] = "Hydroxyethyl Acrylate/Sodium Acryloyldimethyl Taurate Copolymer";
        A.enIng[16] = "Phenyl Trimethicone";
        A.enIng[17] = "Cellulose Gum";
        A.enIng[18] = "Ethylhexylglycerin";
        A.enIng[19] = "Glycerin";
        A.enIng[20] = "Acrylates/Stearyl Methacrylate Copolymer";
        A.enIng[21] = "Tromethamine";
        A.enIng[22] = "Disodium EDTA";
        A.enIng[23] = "Flavor";

        A.danger[0] = 1;
        A.danger[1] = 1;
        A.danger[2] = 2;
        A.danger[3] = 1;
        A.danger[4] = 3;
        A.danger[5] = 0;
        A.danger[6] = 1;
        A.danger[7] = 1;
        A.danger[8] = 0;
        A.danger[9] = 1;
        A.danger[10] = 3;
        A.danger[11] = 1;
        A.danger[12] = 1;
        A.danger[13] = 1;
        A.danger[14] = 4;
        A.danger[15] = 1;
        A.danger[16] = 1;
        A.danger[17] = 1;
        A.danger[18] = 1;
        A.danger[19] = 2;
        A.danger[20] = 0;
        A.danger[21] = 2;
        A.danger[22] = 1;
        A.danger[23] = 8;

        reviews = new ArrayList<Review>();
        reviews.add(new Review("UserA", 3, "SoSo"));
        reviews.add(new Review("UserB", 4, "좋아요"));
        A.rv = reviews;
        A.rc = new int[]{1, 3, 4};
        cosInfos.add(A);

        A = new CosInfo(47,3);
        A.idx = 1;
        A.img = R.drawable.aqua_moisture_cream;
        A.name = "아쿠아 모이스처 크림";
        A.brand = "다비드화장품";
        A.type = "크림";
        A.lowPrice = 22400;
        A.highPrice = 32000;

        A.krIng[0] = "정제수";
        A.krIng[1] = "에탄올";
        A.krIng[2] = "부틸렌글라이콜";
        A.krIng[3] = "글리세린";
        A.krIng[4] = "알부틴";
        A.krIng[5] = "사이클로펜타실록산";
        A.krIng[6] = "디메치콘";
        A.krIng[7] = "디메치콘/비닐디메치콘크로스폴리머";
        A.krIng[8] = "비피다발효용해물";
        A.krIng[9] = "카보머";
        A.krIng[10] = "폴리아크릴아마이드";
        A.krIng[11] = "피이지-40하이드로제네이티드캐스터오일";
        A.krIng[12] = "폴리소르베이트60";
        A.krIng[13] = "글리세릴아크릴레이트/아크릴릭애씨드코폴리머";
        A.krIng[14] = "프로필렌글라이콜";
        A.krIng[15] = "C13-1이소파라핀";
        A.krIng[16] = "1,2-헥산디올";
        A.krIng[17] = "소듐하이알루로네이트";
        A.krIng[18] = "녹차추출물";
        A.krIng[19] = "판테놀";
        A.krIng[20] = "카프릴릴글라이콜";
        A.krIng[21] = "글리세릴카프릴레이트";
        A.krIng[22] = "카프릭하이드록사믹애씨드";
        A.krIng[23] = "글리세릴라우레이트";
        A.krIng[24] = "오레가노잎추출물";
        A.krIng[25] = "유칼립투스잎오일";
        A.krIng[26] = "들깨오일";
        A.krIng[27] = "옥탄디올";
        A.krIng[28] = "트로폴론";
        A.krIng[29] = "쌀겨추출물";
        A.krIng[30] = "글레디치아아우스트랄리스열매추출물";
        A.krIng[31] = "라케모사승마뿌리추출물";
        A.krIng[32] = "백지추출물";
        A.krIng[33] = "백급추출물";
        A.krIng[34] = "녹두추출물";
        A.krIng[35] = "콜로신스열매추출물";
        A.krIng[36] = "감송향추출물";
        A.krIng[37] = "사인추출물";
        A.krIng[38] = "클로브꽃추출물";
        A.krIng[39] = "자작나무수액";
        A.krIng[40] = "감초추출물";
        A.krIng[41] = "포타슘하이드록사이드";
        A.krIng[42] = "잔탄검";
        A.krIng[43] = "라우레스-7";
        A.krIng[44] = "디소듐이디티에이";
        A.krIng[45] = "아스코빌팔미테이트";
        A.krIng[46] = "향료";


        A.enIng[0] = "Water Aqua";
        A.enIng[1] = "Alcohol";
        A.enIng[2] = "Butylene Glycol";
        A.enIng[3] = "Glycerin";
        A.enIng[4] = "Arbutin";
        A.enIng[5] = "Cyclopentasiloxane";
        A.enIng[6] = "Dimethicone";
        A.enIng[7] = "Dimethicone/Vinyl Dimethicone Crosspolymer";
        A.enIng[8] = "Bifida Ferment Lysate";
        A.enIng[9] = "Carbomer";
        A.enIng[10] = "Polyacrylamide";
        A.enIng[11] = "PEG-40 Hydrogenated Castor Oil";
        A.enIng[12] = "Polysorbate 60";
        A.enIng[13] = "Glyceryl Acrylate/Acrylic Acid Copolymer";
        A.enIng[14] = "Propylene Glycol";
        A.enIng[15] = "C13-1Isoparaffin";
        A.enIng[16] = "1,2-Hexanediol";
        A.enIng[17] = "Sodium Hyaluronate";
        A.enIng[18] = "Camellia Sinensis Leaf Extract";
        A.enIng[19] = "Panthenol";
        A.enIng[20] = "Caprylyl Glycol";
        A.enIng[21] = "Glyceryl Caprylat";
        A.enIng[22] = "Caprylhydroxamic Acid";
        A.enIng[23] = "Glyceryl Laurate";
        A.enIng[24] = "Origanum Vulgare Leaf Extract";
        A.enIng[25] = "Eucalyptus Globulus Leaf Oil";
        A.enIng[26] = "Perilla Ocymoides Seed Oil";
        A.enIng[27] = "Octanediol";
        A.enIng[28] = "Tropolone";
        A.enIng[29] = "Oryza Sativa (Rice) Bran Extract";
        A.enIng[30] = "Gleditsia Australis Fruit Extract";
        A.enIng[31] = "Cimicifuga Racemosa Root Extract";
        A.enIng[32] = "Angelica Dahurica Root Extract";
        A.enIng[33] = "Bletilla Striata Root Extract";
        A.enIng[34] = "Phaseolus Radiatus Seed Extract";
        A.enIng[35] = "Citrullus Colocynthis Fruit Extract";
        A.enIng[36] = "Nardostachys Chinensis Root Extract";
        A.enIng[37] = "Amomum Xanthioides Seed Extract";
        A.enIng[38] = "Eugenia Caryophyllus (Clove) Flower Extract";
        A.enIng[39] = "Betula Alba Juice";
        A.enIng[40] = "Glycyrrhiza Glabra (Licorice) Root Extract";
        A.enIng[41] = "Potassium Hydroxide";
        A.enIng[42] = "Xanthan Gum";
        A.enIng[43] = "Laureth-7";
        A.enIng[44] = "Disodium EDTA";
        A.enIng[45] = "Ascorbyl Palmitate";
        A.enIng[46] = "Flavor";

        A.danger[0] = 1;
        A.danger[1] = 2;
        A.danger[2] = 1;
        A.danger[3] = 2;
        A.danger[4] = 1;
        A.danger[5] = 3;
        A.danger[6] = 3;
        A.danger[7] = 1;
        A.danger[8] = 1;
        A.danger[9] = 0;
        A.danger[10] = 4;
        A.danger[11] = 3;
        A.danger[12] = 3;
        A.danger[13] = 1;
        A.danger[14] = 3;
        A.danger[15] = 1;
        A.danger[16] = 1;
        A.danger[17] = 1;
        A.danger[18] = 1;
        A.danger[19] = 1;
        A.danger[20] = 1;
        A.danger[21] = 1;
        A.danger[22] = 1;
        A.danger[23] = 3;
        A.danger[24] = 1;
        A.danger[25] = 2;
        A.danger[26] = 0;
        A.danger[27] = 1;
        A.danger[28] = 1;
        A.danger[29] = 1;
        A.danger[30] = 0;
        A.danger[31] = 1;
        A.danger[32] = 1;
        A.danger[33] = 1;
        A.danger[34] = 0;
        A.danger[35] = 0;
        A.danger[36] = 0;
        A.danger[37] = 0;
        A.danger[38] = 5;
        A.danger[39] = 1;
        A.danger[40] = 1;
        A.danger[41] = 3;
        A.danger[42] = 1;
        A.danger[43] = 3;
        A.danger[44] = 1;
        A.danger[45] = 1;
        A.danger[46] = 8;


        A.rv.add(new Review("UserB", 2, "별로다"));
        A.rv.add(new Review("Ms.Bae", 4, "저는 괜찮았어요~"));
        A.rc = new int[]{0, 3, 2};
        cosInfos.add(A);


        A= new CosInfo(27,0);
        A.idx = 2;
        A.img = R.drawable.mamonde_extra_moisture_emulsion;

        A.name = "마몽드 엑스트라 모이스처 에멀전";
        A.brand = "아모레퍼시픽";
        A.type = "에멀전";
        A.lowPrice = 9910;
        A.highPrice = 27180;

        A.krIng[0] = "정제수";
        A.krIng[1] = "부틸렌글라이콜";
        A.krIng[2] = "글리세린";
        A.krIng[3] = "하이드로제네이티드폴리이소부텐";
        A.krIng[4] = "이소스테아릴이소스테아레이트";
        A.krIng[5] = "디메치콘";
        A.krIng[6] = "사이클로펜타실록산";
        A.krIng[7] = "폴리소르베이트60";
        A.krIng[8] = "눈연꽃추출물";
        A.krIng[9] = "하이드롤라이즈드루핀프로테인";
        A.krIng[10] = "하이알루로닉애씨드";
        A.krIng[11] = "망고씨드버터";
        A.krIng[12] = "글리세릴스테아레이트";
        A.krIng[13] = "글리세릴카프릴레이트";
        A.krIng[14] = "디메치콘올";
        A.krIng[15] = "세테아릴알코올";
        A.krIng[16] = "소르비탄스테아레이트";
        A.krIng[17] = "페녹시에탄올";
        A.krIng[18] = "향료";
        A.krIng[19] = "잔탄검";
        A.krIng[20] = "카보머";
        A.krIng[21] = "아크릴레이트/스테아릴메타크릴레이트코폴리머";
        A.krIng[22] = "에칠헥실글리세린";
        A.krIng[23] = "폴리실리콘-11";
        A.krIng[24] = "피이지-100스테아레이트";
        A.krIng[25] = "트로메타민";
        A.krIng[26] = "디소듐이디티에이";

        A.enIng[0] = "Water Aqua";
        A.enIng[1] = "Butylene Glycol";
        A.enIng[2] = "Glycerin";
        A.enIng[3] = "Hydrogenated Polyisobutene";
        A.enIng[4] = "Isostearyl Isostearate";
        A.enIng[5] = "Dimethicone";
        A.enIng[6] = "Cyclopentasiloxane";
        A.enIng[7] = "Polysorbate 60";
        A.enIng[8] = "Saussurea Involucrata Extract";
        A.enIng[9] = "Hydrolyzed Lupine Protein";
        A.enIng[10] = "Hyaluronic Acid";
        A.enIng[11] = "Mangifera Indica (Mango) Seed Butter";
        A.enIng[12] = "Glyceryl Stearate";
        A.enIng[13] = "Glyceryl Caprylate";
        A.enIng[14] = "Dimethiconol";
        A.enIng[15] = "Cetearyl Alcohol";
        A.enIng[16] = "Sorbitan Stearate";
        A.enIng[17] = "Phenoxyethanol";
        A.enIng[18] = "Flavor";
        A.enIng[19] = "Xanthan Gum";
        A.enIng[20] = "Carbomer";
        A.enIng[21] = "Acrylates/Stearyl Methacrylate Copolymer";
        A.enIng[22] = "Ethylhexylglycerin";
        A.enIng[23] = "Polysilicone-11";
        A.enIng[24] = "PEG-100 Stearate";
        A.enIng[25] = "Tromethamine ";
        A.enIng[26] = "Disodium EDTA";

        A.danger[0] = 1;
        A.danger[1] = 1;
        A.danger[2] = 2;
        A.danger[3] = 1;
        A.danger[4] = 1;
        A.danger[5] = 3;
        A.danger[6] = 3;
        A.danger[7] = 3;
        A.danger[8] = 1;
        A.danger[9] = 1;
        A.danger[10] = 1;
        A.danger[11] = 1;
        A.danger[12] = 1;
        A.danger[13] = 1;
        A.danger[14] = 1;
        A.danger[15] = 1;
        A.danger[16] = 1;
        A.danger[17] = 4;
        A.danger[18] = 8;
        A.danger[19] = 1;
        A.danger[20] = 1;
        A.danger[21] = 0;
        A.danger[22] = 1;
        A.danger[23] = 1;
        A.danger[24] = 3;
        A.danger[25] = 2;
        A.danger[26] = 1;

        A.rv.add(new Review("TasteHam", 5, "또 구입할것같네요"));
        A.rv.add(new Review("비싼지름길", 1, "제 피부랑은 안 맞는 것 같아요.. 사실뿐"));

        cosInfos.add(A);


        A= new CosInfo(23,0);
        A.idx = 3;
        A.img = R.drawable.envie_solution_soothing_lotion;


        A.name = "엔비 솔루션 수딩 로션";
        A.brand = "엔비";
        A.type = "로션";
        A.lowPrice = 22120;
        A.highPrice = 25000;

        A.krIng[0] = "정제수";
        A.krIng[1] = "부틸렌글라이콜";
        A.krIng[2] = "글리세린";
        A.krIng[3] = "세틸에칠헥사노에이트";
        A.krIng[4] = "글리세릴스테아레이트에스이";
        A.krIng[5] = "디메치콘";
        A.krIng[6] = "하이드로제네이티드폴리이소부텐";
        A.krIng[7] = "이소스테아릭애씨드";
        A.krIng[8] = "폴리소르베이트60";
        A.krIng[9] = "스테아릴알코올";
        A.krIng[10] = "스테아릭애씨드";
        A.krIng[11] = "하이알루로닉애씨드";
        A.krIng[12] = "알지닌";
        A.krIng[13] = "초피나무열매추출물";
        A.krIng[14] = "할미꽃추출물";
        A.krIng[15] = "어스니어추출물";
        A.krIng[16] = "카보머";
        A.krIng[17] = "디소듐이디티에이";
        A.krIng[18] = "티트리잎오일";
        A.krIng[19] = "알로에베라잎즙";
        A.krIng[20] = "마치현추출물";
        A.krIng[21] = "위치하젤껍질/잎/잔가지추출물";
        A.krIng[22] = "녹차추출물";

        A.enIng[0] = "Water Aqua";
        A.enIng[1] = "Butylene Glycol";
        A.enIng[2] = "Glycerin";
        A.enIng[3] = "Cetyl Ethylhexanoate";
        A.enIng[4] = "Glyceryl Stearate SE";
        A.enIng[5] = "Dimethicone";
        A.enIng[6] = "Hydrogenated Polyisobutene";
        A.enIng[7] = "Isostearic Acid";
        A.enIng[8] = "Polysorbate 60";
        A.enIng[9] = "Cetearyl Alcohol";
        A.enIng[10] = "Stearic Acid";
        A.enIng[11] = "Hyaluronic Acid";
        A.enIng[12] = "Arginine";
        A.enIng[13] = "Zanthoxylum Piperitum Fruit Extract";
        A.enIng[14] = "Pulsatilla Koreana Extract";
        A.enIng[15] = "Usnea Barbata (Lichen) Extract";
        A.enIng[16] = "Carbomer";
        A.enIng[17] = "Disodium EDTA";
        A.enIng[18] = "Melaleuca Alternifolia (Tea Tree) Leaf Oil";
        A.enIng[19] = "Aloe Barbadensis Leaf Juice";
        A.enIng[20] = "Portulaca Oleracea Extract";
        A.enIng[21] = "Hamamelis Virginiana (Witch Hazel) Bark/Leaf/Twig Extract";
        A.enIng[22] = "Camellia Sinensis Leaf Extract";

        A.danger[0] = 1;
        A.danger[1] = 1;
        A.danger[2] = 2;
        A.danger[3] = 1;
        A.danger[4] = 1;
        A.danger[5] = 3;
        A.danger[6] = 1;
        A.danger[7] = 1;
        A.danger[8] = 3;
        A.danger[9] = 1;
        A.danger[10] = 1;
        A.danger[11] = 1;
        A.danger[12] = 1;
        A.danger[13] = 1;
        A.danger[14] = 1;
        A.danger[15] = 0;
        A.danger[16] = 0;
        A.danger[17] = 1;
        A.danger[18] = 1;
        A.danger[19] = 1;
        A.danger[20] = 1;
        A.danger[21] = 0;
        A.danger[22] = 1;


        A.rv.add(new Review("화장하고 싶어요", 4, "딱 제 타입입니다."));
        A.rv.add(new Review("youha", 3, "나름 괜찮습니다."));
        A.rv.add(new Review("UserF", 5, "좋아요"));
        cosInfos.add(A);


        A= new CosInfo(44,0);
        A.idx = 4;
        A.img = R.drawable.sample_image;
        A.name = "라네즈 밸런싱 에멀전 모이스처";
        A.brand = "라네즈";
        A.type = "로션";
        A.lowPrice = 17110;
        A.highPrice = 42530;
        A.krIng[0] = "정제수";
        A.krIng[1] = "부틸렌글라이콜";
        A.krIng[2] = "하이드로제네이티드폴리(C6-14올레핀)";
        A.krIng[3] = "글리세린";
        A.krIng[4] = "디메치콘";
        A.krIng[5] = "카프릴릭/카프릭트리글리세라이드";
        A.krIng[6] = "세틸에칠헥사노에이트";
        A.krIng[7] = "프로판디올";
        A.krIng[8] = "슈크로오스스테아레이트";
        A.krIng[9] = "베타-글루칸";
        A.krIng[10] = "마그네슘설페이트";
        A.krIng[11] = "망가니즈설페이트";
        A.krIng[12] = "징크설페이트";
        A.krIng[13] = "백년초열매추출물";
        A.krIng[14] = "자작나무수액";
        A.krIng[15] = "퀴노아씨추출물";
        A.krIng[16] = "글라이코젠";
        A.krIng[17] = "글루타믹애씨드";
        A.krIng[18] = "호호바씨오일";
        A.krIng[19] = "알지닌";
        A.krIng[20] = "만니톨";
        A.krIng[21] = "피씨에이";
        A.krIng[22] = "세린";
        A.krIng[23] = "슈크로오스";
        A.krIng[24] = "시트룰린";
        A.krIng[25] = "알라닌";
        A.krIng[26] = "트레오닌";
        A.krIng[27] = "글리세릴스테아레이트";
        A.krIng[28] = "디메치콘올";
        A.krIng[29] = "라이신에이치씨엘";
        A.krIng[30] = "히스티딘에이치씨엘";
        A.krIng[31] = "세테아릴알코올";
        A.krIng[32] = "쉐어버터";
        A.krIng[33] = "사이클로펜타실록산";
        A.krIng[34] = "아스코빌글루코사이드";
        A.krIng[35] = "스테아릭애씨드";
        A.krIng[36] = "팔미틱애씨드";
        A.krIng[37] = "카보머";
        A.krIng[38] = "에칠헥실글리세린";
        A.krIng[39] = "칼슘클로라이드";
        A.krIng[40] = "트로메타민";
        A.krIng[41] = "디소듐이디티에이";
        A.krIng[42] = "페녹시에탄올";
        A.krIng[43] = "향료";

        A.enIng[0] = "Water Aqua";
        A.enIng[1] = "Butylene Glycol";
        A.enIng[2] = "Hydrogenated Poly(C6-14 Olefin)";
        A.enIng[3] = "Glycerin";
        A.enIng[4] = "Dimethicone";
        A.enIng[5] = "Caprylic/Capric Triglyceride";
        A.enIng[6] = "Cetyl Ethylhexanoate";
        A.enIng[7] = "Propanediol";
        A.enIng[8] = "Sucrose Stearate";
        A.enIng[9] = "Beta-Glucan";
        A.enIng[10] = "Magnesium Sulfate";
        A.enIng[11] = "Manganese Sulfate";
        A.enIng[12] = "Zinc Sulfate";
        A.enIng[13] = "Opuntia Coccinellifera Fruit Extract";
        A.enIng[14] = "Betula Alba Juice";
        A.enIng[15] = "Chenopodium Quinoa Seed Extract";
        A.enIng[16] = "Glycogen";
        A.enIng[17] = "Glutamic Acid";
        A.enIng[18] = "Simmondsia Chinensis";
        A.enIng[19] = "Arginine";
        A.enIng[20] = "Mannitol";
        A.enIng[21] = "PCA";
        A.enIng[22] = "Cerin";
        A.enIng[23] = "Sucrose";
        A.enIng[24] = "Citrulline";
        A.enIng[25] = "Alanine";
        A.enIng[26] = "Threonine";
        A.enIng[27] = "Glyceryl Stearate";
        A.enIng[28] = "Dimethiconol";
        A.enIng[29] = "Lysine HCL";
        A.enIng[30] = "Histidine HCl";
        A.enIng[31] = "Cetearyl Alcohol";
        A.enIng[32] = "Butyrospermum Parkii (Shea) Butter";
        A.enIng[33] = "Cyclopentasiloxane";
        A.enIng[34] = "Ascorbyl Glucoside";
        A.enIng[35] = "Stearic Acid";
        A.enIng[36] = "Palmitoyl Inulin";
        A.enIng[37] = "Carbomer";
        A.enIng[38] = "Ethylhexylglycerin";
        A.enIng[39] = "Calcium Chloride ";
        A.enIng[40] = "Tromethamine";
        A.enIng[41] = "Disodium EDTA";
        A.enIng[42] = "Phenoxyethanol";
        A.enIng[43] = "Flavor";


        A.danger[0] = 1;
        A.danger[1] = 1;
        A.danger[2] = 0;
        A.danger[3] = 2;
        A.danger[4] = 3;
        A.danger[5] = 1;
        A.danger[6] = 1;
        A.danger[7] = 1;
        A.danger[8] = 1;
        A.danger[9] = 1;
        A.danger[10] = 1;
        A.danger[11] = 3;
        A.danger[12] = 4;
        A.danger[13] = 0;
        A.danger[14] = 1;
        A.danger[15] = 1;
        A.danger[16] = 1;
        A.danger[17] = 1;
        A.danger[18] = 1;
        A.danger[19] = 1;
        A.danger[20] = 1;
        A.danger[21] = 3;
        A.danger[22] = 1;
        A.danger[23] = 1;
        A.danger[24] = 1;
        A.danger[25] = 1;
        A.danger[26] = 1;
        A.danger[27] = 1;
        A.danger[28] = 1;
        A.danger[29] = 1;
        A.danger[30] = 1;
        A.danger[31] = 1;
        A.danger[32] = 1;
        A.danger[33] = 3;
        A.danger[34] = 1;
        A.danger[35] = 1;
        A.danger[36] = 1;
        A.danger[37] = 0;
        A.danger[38] = 1;
        A.danger[39] = 1;
        A.danger[40] = 2;
        A.danger[41] = 1;
        A.danger[42] = 4;
        A.danger[43] = 8;

        A.rv.add(new Review("UserA", 4, "딱 제 타입입니다."));
        cosInfos.add(A);
    }

}
