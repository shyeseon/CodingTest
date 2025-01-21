class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = (Integer.parseInt(video_len.substring(0,2))*60)+Integer.parseInt(video_len.substring(3));
        int posLen = (Integer.parseInt(pos.substring(0,2))*60)+Integer.parseInt(pos.substring(3));
        int opStart = (Integer.parseInt(op_start.substring(0,2))*60)+Integer.parseInt(op_start.substring(3));
        int opEnd = (Integer.parseInt(op_end.substring(0,2))*60)+Integer.parseInt(op_end.substring(3));
        for(String command : commands){ 
            if(opStart<=posLen && posLen<=opEnd) {
                posLen = opEnd;
            }
            if(command.equals("next")){
                if(posLen>=videoLen-10){
                    posLen = videoLen;
                }else{
                    posLen += 10;
                }
            }else if(command.equals("prev")) {
                if (posLen <= 10) {
                    posLen = 0;
                } else {
                    posLen -= 10;
                }
            }
             if(opStart<=posLen && posLen<=opEnd) {
                posLen = opEnd;
            }
         
        }
        String answer = String.format("%02d:%02d", posLen/60, posLen%60);
        return answer;
    }
}   