class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String email : emails){
            String[] split = email.split("@");
            String localName = split[0].replace(".", "");
            String domainName = split[1];
            int index = localName.indexOf('+');
            if(index >= 0)
                localName = localName.substring(0, index);
            String address = localName + '@' + domainName;
            map.put(address, map.getOrDefault(address, 0) + 1);
        }
        return map.keySet().size();
    }
}
