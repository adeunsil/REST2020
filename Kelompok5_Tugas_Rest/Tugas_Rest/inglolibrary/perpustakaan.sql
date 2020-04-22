-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Apr 2020 pada 11.33
-- Versi server: 10.4.10-MariaDB
-- Versi PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `id` int(6) NOT NULL,
  `judul` varchar(225) NOT NULL,
  `id_penulis` int(6) NOT NULL,
  `id_jenis_buku` int(6) NOT NULL,
  `th_terbit` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id`, `judul`, `id_penulis`, `id_jenis_buku`, `th_terbit`) VALUES
(1, 'Kalkulus', 1, 1, '2020-07-22'),
(2, 'Web Service', 2, 2, '2019-06-12'),
(3, 'Database', 1, 3, '2020-02-12'),
(4, 'Web programming', 3, 2, '2015-02-12'),
(5, 'Metode Numeric', 1, 1, '2018-11-10');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jenis_buku`
--

CREATE TABLE `jenis_buku` (
  `id` int(6) NOT NULL,
  `jenis_buku` varchar(100) NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jenis_buku`
--

INSERT INTO `jenis_buku` (`id`, `jenis_buku`, `keterangan`) VALUES
(1, 'math', 'berisi tentang teori teori ilmu pasti dan segala sesuatu yang berhubungan dengan hitungan matematis'),
(2, 'web', 'merupakan buku yang berkaitan dengan web dan layanan layanan pada web jaringan komputer'),
(3, 'data', 'merupakan buku yang berkaitan dengan pengolahan transformasi analisis data yang digunakan sebagai alat pendukung keputusan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjam`
--

CREATE TABLE `peminjam` (
  `id` int(6) NOT NULL,
  `nama_peminjam` varchar(225) NOT NULL,
  `id_judul_buku` int(6) NOT NULL,
  `penulis` varchar(225) NOT NULL,
  `jenis_buku` varchar(225) NOT NULL,
  `no_telepon` varchar(100) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjam`
--

INSERT INTO `peminjam` (`id`, `nama_peminjam`, `id_judul_buku`, `penulis`, `jenis_buku`, `no_telepon`, `tgl_pinjam`, `tgl_kembali`) VALUES
(2, 'bale', 1, 'Bambang', 'Math', '94791460', '2019-10-08', '2020-02-18'),
(3, 'Rizqi', 4, 'Ade', 'web', '081276543', '2020-04-23', '2020-04-29'),
(4, 'Jihan', 3, 'Hoerudin', 'data', '0843562723', '2020-03-09', '2020-04-30');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penulis`
--

CREATE TABLE `penulis` (
  `id` int(6) NOT NULL,
  `nama_penulis` varchar(255) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penulis`
--

INSERT INTO `penulis` (`id`, `nama_penulis`, `alamat`) VALUES
(1, 'Bambang', 'Cilacap'),
(2, 'Ade', 'tanggerang'),
(3, 'Hoerudin', 'Garut');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_penulis` (`id_penulis`),
  ADD KEY `id_jenis_buku` (`id_jenis_buku`);

--
-- Indeks untuk tabel `jenis_buku`
--
ALTER TABLE `jenis_buku`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_judul_buku` (`id_judul_buku`);

--
-- Indeks untuk tabel `penulis`
--
ALTER TABLE `penulis`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `buku`
--
ALTER TABLE `buku`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `jenis_buku`
--
ALTER TABLE `jenis_buku`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `peminjam`
--
ALTER TABLE `peminjam`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `penulis`
--
ALTER TABLE `penulis`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `fk_jenis_buku` FOREIGN KEY (`id_jenis_buku`) REFERENCES `jenis_buku` (`id`),
  ADD CONSTRAINT `fk_penulis` FOREIGN KEY (`id_penulis`) REFERENCES `penulis` (`id`);

--
-- Ketidakleluasaan untuk tabel `peminjam`
--
ALTER TABLE `peminjam`
  ADD CONSTRAINT `fk_judul_buku` FOREIGN KEY (`id_judul_buku`) REFERENCES `buku` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
