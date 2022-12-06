package com.csv.Pokedexapi.utils;

//public class HttpConnection {
//
//    private static final String prefix = "https://pokeapi.co/api/v2/";
//
//    private String url;
//
//    public HttpConnection(String url) {
//        this.url = prefix + url;
//    }
//
//    private String read() throws Exception {
//        try {
//            URL website = new URL(url);
//            URLConnection connection = website.openConnection();
//
//            connection.setRequestProperty("Content-type", "application/json");
//            connection.setRequestProperty("accept", "application/json");
//            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder result = new StringBuilder();
//            String inputLine;
//            while((inputLine = in.readLine()) != null) result.append(inputLine);
//            in.close();
//            return result.toString();
//        } catch (Exception e) {
//            throw new Exception(e);
//        }
//    }
//}
